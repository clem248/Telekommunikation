package sample.controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Worker;
import sample.configs.DatabaseHandler;

import java.io.IOException;

public class RegistrationController {

        @FXML
        private CheckBox FemaleBox;

        @FXML
        private TextField FirstNameField;

        @FXML
        private TextField LastnameField;

        @FXML
        private TextField LoginField;

        @FXML
        private CheckBox MaleBox;

        @FXML
        private PasswordField PasswordField;

        @FXML
        private Button SignInButton;

        @FXML
        private TextField LocationField;

        @FXML
        private Button Back;






    @FXML
    void initialize(){




        SignInButton.setOnAction(event -> {
                    SignUpNewWorker();

                    SignInButton.getScene().getWindow().hide();

                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("/sample/windows/sample.fxml"));
                    try {
                        loader.load();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Parent root = loader.getRoot();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.showAndWait();

                }
            );
        Back.setOnAction(event -> {
            Back.getScene().getWindow().hide();
        });




    }

    private void SignUpNewWorker() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        String firstName = FirstNameField.getText();
        String lastName = LastnameField.getText();
        String workerName = LoginField.getText();
        String location = LocationField.getText();
        String password = PasswordField.getText();
        String gender = "";
        if(MaleBox.isSelected())
            gender = "Male";
            else
                gender = "Female";
            if (FemaleBox.isSelected())
                gender = "Female";
            else
                gender ="Male";

            Worker worker = new Worker (firstName,lastName,workerName,location,password,gender);

            dbHandler.signUpUser(worker);

    }
}



