package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import animations.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Worker;
import sample.configs.DatabaseHandler;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button LogInButton;

    @FXML
    private TextField LoginField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button RegistrationButton;

    @FXML



    void initialize() {
        LogInButton.setOnAction(event -> {

            String loginText = LoginField.getText().trim();
            String loginPassword = PasswordField.getText().trim();

            if(!loginText.equals("")&& !loginPassword.equals("") )
                loginWorker(loginText,loginPassword);
             else
                 System.out.println("You did not fill the password and login");


        });
        RegistrationButton.setOnAction(event -> {


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/windows/RegistrationWindow.fxml"));
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

    private void loginWorker(String loginText, String loginPassword) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Worker worker = new Worker();
        worker.setWorkername(loginText);
        worker.setPassword(loginPassword);
        ResultSet result = dbHandler.getUser(worker);

        int counter = 0;
        while (true) {
            try {
                if (!result.next()) break;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            counter++;
        }
        if (counter >= 1){
            openNewScene("/sample/windows/AccountantWindow.fxml");

        }

        else {
            Shake workerLoginAnim = new Shake(LoginField);
            Shake workerPassAnim = new Shake(PasswordField);

            workerLoginAnim.playAnim();
            workerPassAnim.playAnim();

        }



    }
    public void openNewScene (String window) {


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));
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
}
