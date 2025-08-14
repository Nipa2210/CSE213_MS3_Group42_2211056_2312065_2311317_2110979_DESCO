package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateEBillController
{
    @javafx.fxml.FXML
    private TableColumn CustomerNameTC;
    @javafx.fxml.FXML
    private TableColumn TotalAmountTC;
    @javafx.fxml.FXML
    private TableView CreateEBillTV;
    @javafx.fxml.FXML
    private TableColumn CustomerIDTC;
    @javafx.fxml.FXML
    private TableColumn MeterNumberTC;
    @javafx.fxml.FXML
    private TextField CustomerNameTF;
    @javafx.fxml.FXML
    private TextField CustomerIDTF;
    @javafx.fxml.FXML
    private TextField MeterNumberTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void CustomerBillingOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateEBillOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
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
    }

    @javafx.fxml.FXML
    public void ConfirmandSendOA(ActionEvent actionEvent) {
    }
}