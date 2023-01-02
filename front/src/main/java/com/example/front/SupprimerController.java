package com.example.front;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SupprimerController {


    @FXML
    private TextField id;

    @FXML
    protected void validerDelete(){

        Client client =  new Client();

        client.supprimer(id.getText());



    }








}