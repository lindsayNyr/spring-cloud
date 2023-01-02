package com.example.front;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Objects;

public class RechercherController {



    @FXML
    private Text resAPI;

    @FXML
    private TextField id;

    @FXML
    protected void validerRecherche(){

        Client client =  new Client();

        String res ="";
        if(Objects.equals(id.getText(), "All")){
            res = client.findAll();

        }else {
           res = client.findById(id.getText());
        }


        resAPI.setText(res);
    }



}