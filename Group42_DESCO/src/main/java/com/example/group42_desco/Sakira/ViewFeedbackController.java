package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ViewFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn CustomerNameTC;
    @javafx.fxml.FXML
    private TableColumn CustomerContactTC;
    @javafx.fxml.FXML
    private TableColumn CustomerMessageTC;
    @javafx.fxml.FXML
    private TableView ViewFeedBackTV;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TextField CustomerNameTF;
    @javafx.fxml.FXML
    private TextField CustomerContactTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/MDDashBoard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("MD DashBoard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void ViewOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CustomerMessageOA(ActionEvent actionEvent) {
    }
}