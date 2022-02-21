package sample.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SalaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BackButton;

    @FXML
    private Button FinesButton;

    @FXML
    private Button ListButton;

    @FXML
    private Button MonthlyButton;

    @FXML
    private Button PremiumButton;

    @FXML
    void initialize() {
        BackButton.setOnAction(event -> {
            BackButton.getScene().getWindow().hide();
        });
        FinesButton.setOnAction(event -> {

        });
        ListButton.setOnAction(event -> {

        });
        MonthlyButton.setOnAction(event -> {

        });
        PremiumButton.setOnAction(event -> {

        });
        BackButton.setOnAction(event -> {

        });


    }

}
