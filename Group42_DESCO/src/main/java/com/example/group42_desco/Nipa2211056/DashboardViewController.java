package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class DashboardViewController
{
    @javafx.fxml.FXML
    private TextArea CustomerIDTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ShowdetailsOnaction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CustomerDashboard.fxml"));
            fxmlLoader.load();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void CSROnaction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CSRDashboard.fxml"));
            fxmlLoader.load();
        }
        catch(Exception e){

        }
    }

    @FXML
    public void CDOnaction(String actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProfileView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Hello!");
            stage.setScene(scene);

            DashboardViewController nextController = fxmlLoader.getController();
            nextController.CDOnaction(CustomerIDTextfield.getText());

            stage.show();
        }
        catch(Exception e){
            //
        }
    }
}