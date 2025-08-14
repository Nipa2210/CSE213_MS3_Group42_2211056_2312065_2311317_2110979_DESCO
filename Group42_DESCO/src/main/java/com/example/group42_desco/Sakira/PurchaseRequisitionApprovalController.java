package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PurchaseRequisitionApprovalController
{
    @javafx.fxml.FXML
    private TableColumn BudgetCodeTC;
    @javafx.fxml.FXML
    private TableColumn QuantityTC;
    @javafx.fxml.FXML
    private TableColumn UnitPriceTC;
    @javafx.fxml.FXML
    private TableColumn TotalCostTC;
    @javafx.fxml.FXML
    private TableView PurchaseRequisitionApprovalTV;
    @javafx.fxml.FXML
    private TextField BudgetCodeTF;
    @javafx.fxml.FXML
    private TextField SupplierIDTF;
    @javafx.fxml.FXML
    private TableColumn SupplierIDTC;
    @javafx.fxml.FXML
    private TextField TotalCostTF;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private TextField UnitPriceTF;

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
}