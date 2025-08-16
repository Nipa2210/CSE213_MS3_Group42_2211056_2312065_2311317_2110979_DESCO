package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FeedbackView {


    @FXML
    private TextField SubjectTextfield;
    @FXML
    private ComboBox<String> ratingCombobox;
    @FXML
    private TextArea FBmsgTextarea;
    @FXML
    private Label thankyouLabel;

    @FXML
    public void initialize() {
        ratingCombobox.getItems().addAll("1(Poor)","2(Average)","3(Neutral)","4(Good)","5(Very Good)");
    }

    @FXML
    public void SubOnaction(ActionEvent actionEvent) {
        if (SubjectTextfield.getText().isEmpty() || FBmsgTextarea.getText().isEmpty()) {
            thankyouLabel.setText("Something Went Wrong!");
            thankyouLabel.setStyle("-fx-border-color: red");
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Please Fill up properly");
            errorAlert.show();
        } else {
            thankyouLabel.setText("Thank you for your Feedback!");
            thankyouLabel.setStyle("-fx-border-color: green");
        }

    }

    @FXML
    public void SendOnaction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/ViewFeedback.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Feed Back");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

