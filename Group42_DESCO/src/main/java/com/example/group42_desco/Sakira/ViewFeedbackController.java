package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ViewFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn<ViewFeedback , String> CustomerNameTC;
    @javafx.fxml.FXML
    private TableColumn<ViewFeedback , String> CustomerContactTC;
    @javafx.fxml.FXML
    private TableColumn<ViewFeedback , String> CustomerMessageTC;
    @javafx.fxml.FXML
    private TableView<ViewFeedback > ViewFeedBackTV;
    @javafx.fxml.FXML
    private TableColumn<ViewFeedback , String> DateTC;

    @javafx.fxml.FXML
    public void initialize() {
        CustomerNameTC.setCellValueFactory(new PropertyValueFactory<ViewFeedback , String>("CustomerName"));
        CustomerContactTC.setCellValueFactory(new PropertyValueFactory<ViewFeedback , String>("CustomerContact"));
        CustomerMessageTC.setCellValueFactory(new PropertyValueFactory<ViewFeedback , String>("CustomerMessage"));
        DateTC.setCellValueFactory(new PropertyValueFactory<ViewFeedback , String>("Date"));
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


}