package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ApprovalOfSalarySheetController
{
    @javafx.fxml.FXML
    private TableView ApprovalOfSalarySheetTV;
    @javafx.fxml.FXML
    private TableColumn SalaryBreakDownTC;
    @javafx.fxml.FXML
    private TableColumn TotalMonthlySalaryDisbursedTC;
    @javafx.fxml.FXML
    private TableColumn DeductionTC;
    @javafx.fxml.FXML
    private TableColumn BonusesTC;
    @javafx.fxml.FXML
    private TableColumn OvertimeTC;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void RejectOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOA(ActionEvent actionEvent) {
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