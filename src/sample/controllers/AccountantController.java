package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AccountantController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button BackButton;

        @FXML
        private Button BudgetButton;

        @FXML
        private Button SalaryButton;

        @FXML
        private Button SalaryIncButton;

        @FXML
        void initialize() {
                BackButton.setOnAction(actionEvent -> {
                        BackButton.getScene().getWindow().hide();

                });
                BudgetButton.setOnAction(event ->{

                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("/sample/windows/budget.fxml"));
                        try {
                                loader.load();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.showAndWait();
                });

                SalaryButton.setOnAction(event->{
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("/sample/windows/SalaryWindow.fxml"));
                        try {
                                loader.load();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.showAndWait();
                });

                SalaryIncButton.setOnAction(event->{
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("/sample/windows/Increase.fxml"));
                        try {
                                loader.load();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.showAndWait();
                });



        }

}


