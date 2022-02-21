package sample.controllers;

import java.net.URL;
import java.time.Year;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BudgetController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BackButton;

    @FXML
    private Button CostsButton;

    @FXML
    private Button EarnMonthButton;

    @FXML
    private Button IncomeButton;

    @FXML
    private Button QuarterButton;

    @FXML
    private Button SemiButton;

    @FXML
    private Button YearButton;

    @FXML
    void initialize() {
        BackButton.setOnAction(event -> {
            BackButton.getScene().getWindow().hide();
        });
        CostsButton.setOnAction(event->{


        });
        EarnMonthButton.setOnAction(event->{

        });
        IncomeButton.setOnAction(event->{

        });
        QuarterButton.setOnAction(event->{

        });
        SemiButton.setOnAction(event->{

        });
        YearButton.setOnAction(event->{

        });





    }
}


