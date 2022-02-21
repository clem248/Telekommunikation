package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseHandler;

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
    void initialize(){
        DatabaseHandler dbHandler = new DatabaseHandler();

        SignInButton.setOnAction(event -> {
            dbHandler.signUpUser(FirstNameField.getText(), LastnameField.getText(), LoginField.getText(),
                    PasswordField.getText(), LocationField.getText(), "Male" );
        });

    }
}



