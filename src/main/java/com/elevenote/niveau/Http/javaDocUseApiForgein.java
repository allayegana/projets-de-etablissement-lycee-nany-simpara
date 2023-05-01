package com.elevenote.niveau.Http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class javaDocUseApiForgein {

    public static void main(String[] args) throws IOException, InterruptedException {

         String url = "https://www.omdbapi.com/?i=tt3896198&apikey=dce67263";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

