package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.CreateBudget.BudgetList;
import static com.example.group42_desco.Sakira.PenaltyForDelayedPayments.PaymentsList;

public class PenaltyForDelayedPaymentsController
{
    @javafx.fxml.FXML
    private TableColumn<PenaltyForDelayedPayments , String> UpdatedTotalElectricityBillTC;
    @javafx.fxml.FXML
    private TableColumn<PenaltyForDelayedPayments , String> AddedChargeTC;
    @javafx.fxml.FXML
    private TableView<PenaltyForDelayedPayments> PenaltyForDelayedElectricityPaymentsTV;
    @javafx.fxml.FXML
    private TableColumn<PenaltyForDelayedPayments , String> PreviousBillTC;
    @javafx.fxml.FXML
    private TextField AddedChargeTF;
    @javafx.fxml.FXML
    private TextField PreviousBillTF;
    @javafx.fxml.FXML
    private TextField UpdatedTotalElectricityBillTF;

    @javafx.fxml.FXML
    public void initialize() {
        PreviousBillTC.setCellValueFactory(new PropertyValueFactory<PenaltyForDelayedPayments , String>("PreviousBill"));
        AddedChargeTC.setCellValueFactory(new PropertyValueFactory<PenaltyForDelayedPayments , String>("AddedCharge"));
        UpdatedTotalElectricityBillTC.setCellValueFactory(new PropertyValueFactory<PenaltyForDelayedPayments , String>("UpdatedTotalElectricityBill"));
    }

    @javafx.fxml.FXML
    public void UpdateBillOA(ActionEvent actionEvent) {
        if (PreviousBillTF.getText().isEmpty() || AddedChargeTF.getText().isEmpty() || UpdatedTotalElectricityBillTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        PenaltyForDelayedPayments d = new PenaltyForDelayedPayments(
                Integer.parseInt(PreviousBillTF.getText()),
                Integer.parseInt(AddedChargeTF.getText()),
                Integer.parseInt(UpdatedTotalElectricityBillTF.getText())
        );

        PaymentsList.add(d);
        PenaltyForDelayedElectricityPaymentsTV.getItems().add(d);
        PenaltyForDelayedElectricityPaymentsTV.refresh();
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