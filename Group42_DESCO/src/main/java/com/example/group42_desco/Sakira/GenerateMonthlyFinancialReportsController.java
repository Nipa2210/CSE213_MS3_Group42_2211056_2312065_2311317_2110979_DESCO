package com.example.group42_desco.Sakira;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;


import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.GenerateMonthlyFinancialReports.FinancialReportsList;

public class GenerateMonthlyFinancialReportsController {
    @javafx.fxml.FXML
    private TableColumn<GenerateMonthlyFinancialReports, String> MonthTC;
    @javafx.fxml.FXML
    private TableColumn<GenerateMonthlyFinancialReports, String> BalanceSheetTC;
    @javafx.fxml.FXML
    private TableColumn<GenerateMonthlyFinancialReports, String> IncomeStatementTC;
    @javafx.fxml.FXML
    private TextField BalanceSheetTF;
    @javafx.fxml.FXML
    private ComboBox<String> MonthCB;
    @javafx.fxml.FXML
    private TextField IncomeStatementTF;
    @javafx.fxml.FXML
    private TableView<GenerateMonthlyFinancialReports> GenerateMonthlyFinancialReportsTV;

    @javafx.fxml.FXML
    public void initialize() {
        MonthCB.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");


        IncomeStatementTC.setCellValueFactory(new PropertyValueFactory<GenerateMonthlyFinancialReports, String>("IncomeStatement"));
        BalanceSheetTC.setCellValueFactory(new PropertyValueFactory<GenerateMonthlyFinancialReports, String>("BalanceSheet"));
        MonthTC.setCellValueFactory(new PropertyValueFactory<GenerateMonthlyFinancialReports, String>("Month"));


    }


    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/AccountantDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Accountant Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @javafx.fxml.FXML
    public void GenerateReportOA(ActionEvent actionEvent) {
        if (IncomeStatementTF.getText().isEmpty() || MonthCB.getValue() == null || BalanceSheetTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return; // Stop execution if any field is empty
        }

        // 2. Create the new budget object
        GenerateMonthlyFinancialReports g = new GenerateMonthlyFinancialReports(
                IncomeStatementTF.getText(),
                Integer.parseInt(BalanceSheetTF.getText()),
                MonthCB.getValue());


        // 3. Add the new object to the list and refresh the table
        FinancialReportsList.add(g);
        GenerateMonthlyFinancialReportsTV.getItems().add(g);
        GenerateMonthlyFinancialReportsTV.refresh(); // Refresh the table to show the new data////


    }
}

