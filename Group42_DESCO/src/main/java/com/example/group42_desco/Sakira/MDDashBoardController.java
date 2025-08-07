package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MDDashBoardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ApprovalOfSalarySheetOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/ApprovalOfSalarySheet.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Approval Of Salary Sheet");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @javafx.fxml.FXML
    public void SetUpTandCOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/SetTandC.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Set T&C");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    @javafx.fxml.FXML
    public void ViewFeedbackOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewCustomerProfileOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewElectricityStorageOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LogOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewSupplierProfileOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewSalarySheetOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PurchaseRequisitionApprovalOA(ActionEvent actionEvent) {
    }
}