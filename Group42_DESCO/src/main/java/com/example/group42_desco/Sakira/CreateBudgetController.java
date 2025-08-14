package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CreateBudgetController
{
    @javafx.fxml.FXML
    private TableView CreateBudgetTV;
    @javafx.fxml.FXML
    private TextField BudgetForNextYearTF;
    @javafx.fxml.FXML
    private TableColumn TotalBudgetTC;
    @javafx.fxml.FXML
    private ComboBox DepartmentCB;
    @javafx.fxml.FXML
    private TableColumn DepartmentTC;
    @javafx.fxml.FXML
    private ComboBox FiscalYearCB;
    @javafx.fxml.FXML
    private TableColumn FiscalYearTC;
    @javafx.fxml.FXML
    private Label SendForApprovalLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ShowTotalBudgetSummaryOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendForApprovalOA(ActionEvent actionEvent) {
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
}