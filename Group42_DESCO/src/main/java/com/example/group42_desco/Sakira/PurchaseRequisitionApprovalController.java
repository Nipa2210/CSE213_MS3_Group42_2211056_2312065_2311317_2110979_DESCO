package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.PenaltyForDelayedPayments.PaymentsList;
import static com.example.group42_desco.Sakira.PurchaseRequisitionApproval.ApprovalList;

public class PurchaseRequisitionApprovalController
{
    @javafx.fxml.FXML
    private TableColumn<PurchaseRequisitionApproval , String> BudgetCodeTC;
    @javafx.fxml.FXML
    private TableColumn<PurchaseRequisitionApproval , String> QuantityTC;
    @javafx.fxml.FXML
    private TableColumn<PurchaseRequisitionApproval , String> UnitPriceTC;
    @javafx.fxml.FXML
    private TableColumn<PurchaseRequisitionApproval , String> TotalCostTC;
    @javafx.fxml.FXML
    private TableView<PurchaseRequisitionApproval> PurchaseRequisitionApprovalTV;
    @javafx.fxml.FXML
    private TextField BudgetCodeTF;
    @javafx.fxml.FXML
    private TextField SupplierIDTF;
    @javafx.fxml.FXML
    private TableColumn<PurchaseRequisitionApproval , String> SupplierIDTC;
    @javafx.fxml.FXML
    private TextField TotalCostTF;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private TextField UnitPriceTF;

    @javafx.fxml.FXML
    public void initialize() {
        QuantityTC.setCellValueFactory(new PropertyValueFactory<PurchaseRequisitionApproval , String>("Quantity"));
        SupplierIDTC.setCellValueFactory(new PropertyValueFactory<PurchaseRequisitionApproval , String>("SupplierID"));
        UnitPriceTC.setCellValueFactory(new PropertyValueFactory<PurchaseRequisitionApproval , String>("UnitPrice"));
        TotalCostTC.setCellValueFactory(new PropertyValueFactory<PurchaseRequisitionApproval , String>("TotalCost"));
        BudgetCodeTC.setCellValueFactory(new PropertyValueFactory<PurchaseRequisitionApproval , String>("BudgetCode"));
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
        if (QuantityTF.getText().isEmpty() || SupplierIDTF.getText().isEmpty() || UnitPriceTF.getText().isEmpty() || TotalCostTF.getText().isEmpty() || BudgetCodeTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        PurchaseRequisitionApproval v = new PurchaseRequisitionApproval(
                Integer.parseInt(QuantityTF.getText()),
                SupplierIDTF.getText(),
                Integer.parseInt(UnitPriceTF.getText()),
                Integer.parseInt(TotalCostTF.getText()),
                Integer.parseInt(BudgetCodeTF.getText())
        );

        ApprovalList.add(v);
        PurchaseRequisitionApprovalTV.getItems().add(v);
        PurchaseRequisitionApprovalTV.refresh();
    }
}