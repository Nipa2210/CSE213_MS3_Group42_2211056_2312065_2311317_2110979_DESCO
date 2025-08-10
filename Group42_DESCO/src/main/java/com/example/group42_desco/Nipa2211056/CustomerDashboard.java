package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerDashboard {

    @FXML
    void EusageOnaction(ActionEvent actionEvent) {

    }

    @FXML
    void FeedbackOnaction(ActionEvent actionEvent) {

    }

    @FXML
    void applyNewconnectionOnaction(ActionEvent actionEvent) {

    }

    @FXML
    void outageNotificationOnaction(ActionEvent actionEvent) {

    }

    @FXML
    void paybillOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/PayBillView.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Pay our Bill");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
           throw new RuntimeException(e);
        }

    }

    @FXML
    void payhistoryOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/PaymentHistory_View.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Payment History");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void profileOnaction(ActionEvent event) {

    }

    @FXML
    void serviceReqOnaction(ActionEvent event) {

    }

    @FXML
    public void initialize() {

    }

    @FXML
    public void complaintformOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/ComplaintFormView.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Complaint Form");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


