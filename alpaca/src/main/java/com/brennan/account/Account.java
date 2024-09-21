package com.brennan.account;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.brennan.api_requests.Request;
import com.brennan.endpoints.PaperEndpoints;
import com.brennan.json.account.AccountJson;
import com.google.gson.Gson;


public class Account {

    private static Request request = new Request();
    public static AccountJson getAccount() throws URISyntaxException {
        try {
            //Creates a get request
            HttpRequest accountGet = request.createGetRequest(PaperEndpoints.ACCOUNT);

            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            
            //Sends the request and holds response
            HttpResponse<String> getAccountResponse = client.send(accountGet, BodyHandlers.ofString());

            if (getAccountResponse.statusCode() != 200) {
                System.out.println("Somethig went wrong, error code " + getAccountResponse.statusCode()
                + "\n" + getAccountResponse.headers());
            }

            return gson.fromJson(getAccountResponse.body(), AccountJson.class);

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


