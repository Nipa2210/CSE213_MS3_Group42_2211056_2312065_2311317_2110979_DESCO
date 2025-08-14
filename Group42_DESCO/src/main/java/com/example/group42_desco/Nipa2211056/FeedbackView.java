package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class FeedbackView {

    @FXML
    private TableColumn<?, ?> CustomerMessageColumn;

    @FXML
    private TableColumn<?, ?> CustomerNameColumn;

    @FXML
    private TableColumn<?, ?> DateColumn;

    @FXML
    private TableView<?> FeedBackTableview;

    @FXML
    private TableColumn<?, ?> MeterNumberColumn;


    @FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/View_Feedback.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Payment History");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

