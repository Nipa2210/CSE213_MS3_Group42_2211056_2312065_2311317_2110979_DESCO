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
import static com.example.group42_desco.Sakira.GenerateBalanceSheet.BalanceSheetList;

public class GenerateBalanceSheetController
{
    @javafx.fxml.FXML
    private ComboBox<String> DesiredMonthCB;
    @javafx.fxml.FXML
    private TableColumn<GenerateBalanceSheet , String> TotalAssetsTC;
    @javafx.fxml.FXML
    private ComboBox<Integer> FiscalYearCB;
    @javafx.fxml.FXML
    private TableColumn<GenerateBalanceSheet , String> TotalLiabilitiesTC;
    @javafx.fxml.FXML
    private TableColumn<GenerateBalanceSheet , String> EquityBreakdownTC;
    @javafx.fxml.FXML
    private TableView<GenerateBalanceSheet> GenerateBalanceSheetTV;
    @javafx.fxml.FXML
    private TableColumn<GenerateBalanceSheet , Integer> FiscalYearTC;
    @javafx.fxml.FXML
    private TableColumn<GenerateBalanceSheet , String> DesireMonthTC;
    @javafx.fxml.FXML
    private TextField TotalAssetsTF;
    @javafx.fxml.FXML
    private TextField TotalLiabilitiesTF;
    @javafx.fxml.FXML
    private TextField EquityBreakdownTF;


    @javafx.fxml.FXML
    public void initialize() {
        DesiredMonthCB.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        FiscalYearCB.getItems().addAll(2022, 2023, 2024, 2025, 2026,2027);

        DesireMonthTC.setCellValueFactory(new PropertyValueFactory<GenerateBalanceSheet , String>("DesiredMonth"));
        FiscalYearTC.setCellValueFactory(new PropertyValueFactory<GenerateBalanceSheet , Integer>("FiscalYear"));
        TotalAssetsTC.setCellValueFactory(new PropertyValueFactory<GenerateBalanceSheet , String>("TotalAssets"));
        TotalLiabilitiesTC.setCellValueFactory(new PropertyValueFactory<GenerateBalanceSheet , String>("TotalLiabilities"));
        EquityBreakdownTC.setCellValueFactory(new PropertyValueFactory<GenerateBalanceSheet , String>("EquityBreakdown"));
    }

    @Deprecated
    public void FilterOA(ActionEvent actionEvent) {
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
    public void ViewOA(ActionEvent actionEvent) {
        if (DesiredMonthCB.getValue() == null || FiscalYearCB.getValue() == null || TotalAssetsTF.getText().isEmpty() || TotalLiabilitiesTF.getText().isEmpty() || EquityBreakdownTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        GenerateBalanceSheet a = new GenerateBalanceSheet(
                DesiredMonthCB.getValue(),
                FiscalYearCB.getValue(),
                Integer.parseInt(TotalAssetsTF.getText()),
                Integer.parseInt(TotalLiabilitiesTF.getText()),
                Integer.parseInt((EquityBreakdownTF.getText()))
        );

        BalanceSheetList.add(a);
        GenerateBalanceSheetTV.getItems().add(a);
        GenerateBalanceSheetTV.refresh();
    }
}