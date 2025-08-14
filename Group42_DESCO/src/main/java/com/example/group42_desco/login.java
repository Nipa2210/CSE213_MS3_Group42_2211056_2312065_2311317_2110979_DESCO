package com.example.group42_desco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class login {

    @FXML
    private TextField EnteryourNametextfield;

    @FXML
    private PasswordField UserPasswordfield;

    @FXML
    private Label warningLabel;

    @FXML
    void EnterOnaction(ActionEvent actionEvent) {
        if(EnteryourNametextfield.getText().isEmpty() || UserPasswordfield.getText().isEmpty()){
        warningLabel.setText("Fill up the required fields");
        warningLabel.setStyle("-fx-border-color: red");
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setContentText("Fill up properly");
        errorAlert.show();
        }

        else{
            warningLabel.setText("Login Successful!");
        }



        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CustomerDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Customer Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}

