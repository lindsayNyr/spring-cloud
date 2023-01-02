package com.example.front;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class AjouterController {

    @FXML
    private TextField nom;

    @FXML
    private TextField ingredients;

    @FXML
    private Spinner difficulte;


    @FXML
    protected void validerAjout() {

        Client client =  new Client();
        client.ajouter(nom.getText().toString(), ingredients.getText().toString(),(int) difficulte.getValue());

    }


}