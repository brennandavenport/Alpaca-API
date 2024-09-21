package com.brennan.api_requests;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;

import io.github.cdimascio.dotenv.Dotenv;


/*
 *This class creates a blueprint for GET, POST, PUT, DELETE http request
 so I dont have to write so much 
 */

public class Request {
    private Dotenv dotenv = Dotenv.configure()
            .directory("/Users/brennandavenport/Downloads/Alpaca API 1/alpaca")
            .filename(".env")
            .load();

    public HttpRequest createGetRequest(String endpoints) throws URISyntaxException {
        return createRequestBuilder(endpoints)
                .GET()
                .build();
    }

    public HttpRequest createPostRequest(String endpoints, String jsonBody) throws URISyntaxException {
        return createRequestBuilder(endpoints)
                .POST(BodyPublishers.ofString(jsonBody))
                .build();
    }

    public HttpRequest createDeleteRequest(String endpoints) throws URISyntaxException {
        return createRequestBuilder(endpoints)
                .DELETE()
                .build();
    }

    //This method creates a part of a http request
    private HttpRequest.Builder createRequestBuilder(String endpoints) throws URISyntaxException {
        String apiKey = dotenv.get("PAPER_API_KEY"); 
        String apiSecret = dotenv.get("PAPER_API_SECRET");

        return HttpRequest.newBuilder()
                .uri(new URI(endpoints))
                .header("accept", "application/json")
                .header("APCA-API-KEY-ID", apiKey)
                .header("APCA-API-SECRET-KEY", apiSecret);
    }
}
