package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class IncreaseController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {
        BackButton.setOnAction(event -> {
            BackButton.getScene().getWindow().hide();
        });



    }

}
