package com.example.front;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class ModifierController {

    @FXML
    private TextField id;

    @FXML
    private TextField nom;

    @FXML
    private TextField ingredients;

    @FXML
    private Spinner difficulte;


    @FXML
    protected void validerModifier() {

        Client client = new Client();
        client.modifier(id.getText(), nom.getText(), ingredients.getText(), (Integer) difficulte.getValue());

    }



    }