package com.example.group42_desco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class login {

    @FXML
    private TextField EnteryourNametextfield;

    @FXML
    private Label Logintextfield;

    @FXML
    private PasswordField UserPasswordfield;

    @FXML
    private ComboBox<String> userTypecombobox;

    @FXML
    private Label warningLabeltextfield;

    @FXML
    void EnterOnaction(ActionEvent event) {

    }

//   try {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginView.fxml"));
//        Parent root = null;
//        try {
//            root = fxmlLoader.load();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Scene scene = new Scene(root);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Login Page");
//        stage.show();
//   }catch (IOException e){
//
//    }


}

