package com.brennan.orders;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import com.brennan.exceptions.NoOrderIdException;
import com.brennan.json.orders.cancel_all_orders.*;
import com.brennan.json.orders.create_order.*;
import com.brennan.json.orders.get_all_orders.*;
import com.brennan.json.orders.get_order_by_id.GetOrderByIdResponseJson;
import com.brennan.api_requests.Request;
import com.brennan.endpoints.PaperEndpoints;


public class Orders {
    //Initializes the client
    private static HttpClient client = HttpClient.newHttpClient();
    private static Gson gson = new Gson();
    private static Request request = new Request();


    //Cancels all open orders if possible
    public static CancelAllOrdersJsonResponse[] deleteAllOrders() throws URISyntaxException {
        try {
            
            HttpRequest deleteOrdersRequest = request.createDeleteRequest(PaperEndpoints.ORDER);

            HttpResponse<String> deleteOrdersResponse = client.send(deleteOrdersRequest, BodyHandlers.ofString());
        
            if (deleteOrdersResponse.statusCode() == 500) {
                System.out.println("Failed to cancel order");
            } else if (deleteOrdersResponse.statusCode() != 207) {
                System.out.println("Something went wrong. Error" + deleteOrdersResponse.statusCode() 
                                    + "\nHeaders: " + deleteOrdersResponse.headers());
                                
            }
            CancelAllOrdersJsonResponse[] allorders = gson.fromJson(deleteOrdersResponse.body(), CancelAllOrdersJsonResponse[].class); 
            return allorders;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
            //Return null b/c error occured
        }
    } 

    //Gets all open orders, prams can be sent through endpount (Not set up yet)
    public static GetAllOrdersJsonResponse[] getAllOrders() throws URISyntaxException {
        try {
            HttpRequest reequest = request.createGetRequest(PaperEndpoints.ORDER);

            HttpResponse<String> getAllOrdersResponse = client.send(reequest, BodyHandlers.ofString());

            GetAllOrdersJsonResponse[] getAllOrders = gson.fromJson(getAllOrdersResponse.body(), GetAllOrdersJsonResponse[].class);

            if (getAllOrdersResponse.statusCode() != 200) {
                System.out.println("Something went wrong. Error" + getAllOrdersResponse.statusCode() 
                                    + "\nHeaders: " + getAllOrdersResponse.headers());
            }
            return getAllOrders;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
            return null;
        }
    }

    //Creates and sends an order
    public static CreateOrderJsonResponse createOrder() throws URISyntaxException {
        try {
            CreateOrderJsonRequest orderRequest = new CreateOrderJsonRequest();
            orderRequest.setSymbol("META");
            orderRequest.setQty("1");
            orderRequest.setSide("buy");
            orderRequest.setTime_in_force("gtc");
            orderRequest.setType("market");

            HttpRequest postOrder = request.createPostRequest(PaperEndpoints.ORDER, gson.toJson(orderRequest));
            
            HttpResponse<String> orderResponse = client.send(postOrder, BodyHandlers.ofString());

            if (orderResponse.statusCode() == 403) {
                System.out.println("Buying power or shares is not sufficient."
                                    + "\nHeader: " + orderResponse.headers());
            } else if (orderResponse.statusCode() == 422) {
                System.out.println("Input parameters are not recognized."
                                    + "\nHeader: " + orderResponse.headers());
            } else if (orderResponse.statusCode() != 200) {
                System.out.println("Something went wrong. Error code: " + orderResponse.statusCode()
                + "\nHeaders: " + orderResponse.headers());
            }

            return gson.fromJson(orderResponse.body(), CreateOrderJsonResponse.class);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static GetOrderByIdResponseJson getOrderById(String orderId) throws URISyntaxException {
        if (orderId.equals("") || orderId == null) 
            throw new NoOrderIdException("OrderId can not be empty");
        
        HttpRequest getOrderByIdRequest = request.createGetRequest((PaperEndpoints.ORDER + "/" + orderId));


        try {
            HttpResponse<String> getOrderByIdResponse = client.send(getOrderByIdRequest, BodyHandlers.ofString());

            if (getOrderByIdResponse.statusCode() != 200) {
                System.out.println("Something went wrong. Error code: " + getOrderByIdResponse.statusCode()
                + "\nHeaders: " + getOrderByIdResponse.headers());
            }

            return gson.fromJson(getOrderByIdResponse.body(), GetOrderByIdResponseJson.class);
    
            //return gson.fromJson(getOrderByIdResponse.body(), GetOrderByIdResponseJson.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int deleteOrderById(String orderId) throws URISyntaxException {
        if (orderId.equals("") || orderId == null) 
            throw new NoOrderIdException("OrderId can not be empty");
        
        HttpRequest deleteOrderByIdRequest = request.createDeleteRequest(PaperEndpoints.ORDER + "/" +orderId);

        try {
            HttpResponse<String> deleteOrderByIdResponse = client.send(deleteOrderByIdRequest, BodyHandlers.ofString());
            return deleteOrderByIdResponse.statusCode(); //422 order unable to cancel - 204 order canceled
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return -1; //Error
        }
    }
}
