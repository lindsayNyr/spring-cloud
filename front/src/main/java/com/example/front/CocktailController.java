package com.example.front;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CocktailController {


    @FXML
    protected void modifier() {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CocktailApplication.class.getResource("modifier-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("modifier cocktails");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    protected void supprimer() {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CocktailApplication.class.getResource("delete-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("supprimer cocktails");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    protected void ajouter() {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CocktailApplication.class.getResource("ajouter-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("ajouter cocktails");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void rechercher() {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CocktailApplication.class.getResource("rechercher-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("rechercher cocktails");
        stage.setScene(scene);
        stage.show();

    }


}