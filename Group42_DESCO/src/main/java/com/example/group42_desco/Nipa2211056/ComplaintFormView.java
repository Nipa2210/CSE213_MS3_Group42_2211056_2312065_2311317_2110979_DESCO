package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.empty;

public class ComplaintFormView {

    @FXML
    private ComboBox<String> CTypeCombobox;

    @FXML
    private TextArea DescTextarea;
    @FXML
    private TextArea messageTextarea;

    @FXML
    public void initialize(){
        this.CTypeCombobox.getItems().addAll("Billing Issue", "Connection Problem", "Service Issue");

    }

//    @FXML
//    void MCOnaction(ActionEvent actionEvent) {
//
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/MyComplaints.fxml"));
//            Scene nextScene = new Scene(fxmlLoader.load());
//            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
//            nextStage.setTitle("My Complaints");
//            nextStage.setScene(nextScene);
//            nextStage.show();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    @FXML
    void SubOnaction(ActionEvent actionEvent) {

        if(CTypeCombobox.getValue() != null && !CTypeCombobox.getValue().isEmpty() && !DescTextarea.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Success!Your Complaint has been Recorded!");
            alert.show();
            this.messageTextarea.setText("Submitted!");
            this.messageTextarea.setStyle("-fx-border-color: Green");
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("This Field is Required!");
            alert.show();

            this.messageTextarea.setText("Submission Failed!");
            this.messageTextarea.setStyle("-fx-border-color: Red");
        }


    }
    @FXML
    void MCOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/MyComplaints.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("My Complaints");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
