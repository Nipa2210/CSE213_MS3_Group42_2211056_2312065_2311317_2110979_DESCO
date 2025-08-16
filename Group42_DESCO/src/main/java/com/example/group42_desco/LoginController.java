package com.example.group42_desco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField EnteryourNametextfield;

    @FXML
    private PasswordField UserPasswordfield;

    @FXML
    private Label warningLabel;

    @FXML
    void EnterOnaction(ActionEvent actionEvent) {

        if (EnteryourNametextfield.getText().isEmpty() || UserPasswordfield.getText().isEmpty()) {
            warningLabel.setText("Fill up the required fields");
            warningLabel.setStyle("-fx-border-color: red");
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Fill up properly");
            errorAlert.show();
        } else {
            warningLabel.setText("Login Successful!");
        }

        if ((EnteryourNametextfield.getText().equals("Nipa")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CustomerDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Customer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        } else if ((EnteryourNametextfield.getText().equals("Akter")) && (UserPasswordfield.getText().equals("12345"))) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CSRDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Customer Service Officer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        } else if ((EnteryourNametextfield.getText().equals("Sakira")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/AccountantDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Accountant Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        }else if ((EnteryourNametextfield.getText().equals("Ahmed")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/MDDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Managing Director Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        }else if ((EnteryourNametextfield.getText().equals("Nabiha")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nabiha/BRSDashboardView.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Live BRS Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        }else if ((EnteryourNametextfield.getText().equals("Sadika")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nabiha/HRManagerDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("HRM Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        } else if ((EnteryourNametextfield.getText().equals("00007")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nur/.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Singer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        }else if ((EnteryourNametextfield.getText().equals("00008")) && (UserPasswordfield.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Fahim/.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Marketing Executive Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            warningLabel.setText("Login Successful");
        } else {
            warningLabel.setText("Incorrect Username and Password");
        }
    }
}


