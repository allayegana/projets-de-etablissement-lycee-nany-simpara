//package com.elevenote.niveau.Http;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.Scanner;
//
//
//public class javaDocUseApiForgein {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//
//        Scanner lecteur = new Scanner(System.in);
//        System.out.println("digitez filme que vous voulez assistez:  ");
//        var  cherche = lecteur.nextLine();
//
//
//
//         String url = "https://www.omdbapi.com/?t=" + cherche +"&apikey=dce67263";
//
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .build();
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
//
//
//    }
//
//
//}
//
