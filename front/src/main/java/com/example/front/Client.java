package com.example.front;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Optional;

public class Client {


    public void ajouter(String nom, String ingredients, int difficulte) {
        try {
            URL url = new URL("http://localhost:8080/cocktails");

            StringBuilder json = new StringBuilder();
            json.append("{");
            json.append("\"nom\":\"").append(nom).append("\",");
            json.append("\"ingredients\":\"").append(ingredients).append("\",");
            json.append("\"difficulte\":").append(difficulte);
            json.append("}");
            System.out.println(json);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);

            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(json.toString());
            writer.flush();
            writer.close();


            if (con.getResponseCode() != 200) {
                throw new RuntimeException("Erreur : " +  con.getResponseCode());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void modifier(String id, String nom, String ingredients, int difficulte) {
        try {

            URL url = new URL("http://localhost:8080/cocktails");

            StringBuilder json = new StringBuilder();
            json.append("{");
            json.append("\"id\":\"").append(id).append("\",");

            json.append("\"nom\":\"").append(nom).append("\",");
            json.append("\"ingredients\":\"").append(ingredients).append("\",");
            json.append("\"difficulte\":").append(difficulte);
            json.append("}");


            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);

            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(json.toString());
            writer.flush();
            writer.close();


            if (con.getResponseCode() != 200) {

                throw new RuntimeException("Erreur : " +  + con.getResponseCode());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void supprimer(String id) {
        try {
            URL url = new URL("http://localhost:8080/cocktails/" + id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("DELETE");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);

            if (con.getResponseCode() != 200) {
                throw new RuntimeException("Erreur : "  + con.getResponseCode());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }



    public String findById(String id) {
        try {
            URL url = new URL("http://localhost:8080/cocktails/" + id);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");

            if (con.getResponseCode() != 200) {
                throw new RuntimeException("Error : " + con.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            String output = br.readLine();
            con.disconnect();


            return output.toString();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String findAll() {
        try {
            URL url = new URL("http://localhost:8080/cocktails");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");

            if (con.getResponseCode() != 200) {
                throw new RuntimeException("Error : " + con.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            String output = br.readLine();
            con.disconnect();


            return output.toString();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    }