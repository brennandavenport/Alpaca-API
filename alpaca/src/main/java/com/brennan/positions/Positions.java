package com.brennan.positions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.brennan.api_requests.Request;
import com.brennan.endpoints.PaperEndpoints;
import com.brennan.json.positions.get_all_positions.PositionsJson;
import com.google.gson.Gson;


public class Positions {
    private HttpClient client = HttpClient.newHttpClient();
    private Gson gson = new Gson();
    private Request requestObj = new Request();

    public PositionsJson[] getAllPositions() throws URISyntaxException {
        try {
            HttpRequest request = requestObj.createGetRequest(PaperEndpoints.POSITION);

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Something went wrong. Error: " + response.statusCode() 
                                    + ". Headers: " + response.headers());
            }
    
            return gson.fromJson(response.body(), PositionsJson[].class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Close all positions
    public int closeAllPositions() throws URISyntaxException, IOException, InterruptedException {
        return buildHttpResponse(RequestType.DELETE, null).statusCode();
    }

    //Gets the position by asset id
    public PositionsJson getPositionById(String id) throws URISyntaxException, IOException, InterruptedException {
        HttpResponse<String> response = buildHttpResponse(RequestType.GET, id);

        PositionsJson json = gson.fromJson(response.body(), PositionsJson.class);
        json.setStatusCode(response.statusCode());
        return json;
    }

    //closes position by asset id
    public int closePositionById(String id) throws URISyntaxException, IOException, InterruptedException {
        return buildHttpResponse(RequestType.DELETE, id).statusCode();
    }
    
    //Returns the server response to the specific request
    public HttpResponse<String> buildHttpResponse(RequestType type, String id) throws URISyntaxException, IOException, InterruptedException {
        Request httpRequest = new Request();

        HttpRequest request = null;

        String endpoint = PaperEndpoints.POSITION;

        if (id != null)
            endpoint += "/" + id;

        switch (type) {
            case GET:
                request = httpRequest.createGetRequest(endpoint);
                break;
            case POST:
                //No Implementation yet
                break;
            case PUT:
                //No Implementation yet
                break;
            case DELETE:
                request = httpRequest.createDeleteRequest(endpoint);
                break;
            default:
                //Error
                break;
        }
        return client.send(request, BodyHandlers.ofString());
    }    
}
