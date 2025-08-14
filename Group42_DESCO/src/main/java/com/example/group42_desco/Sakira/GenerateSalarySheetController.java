package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.GenerateSalarySheet.SalarySheetList;

public class GenerateSalarySheetController
{
    @javafx.fxml.FXML
    private TableColumn<GenerateSalarySheet, String> MonthTC;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private TableColumn<GenerateSalarySheet, String> DepartmentTC;
    @javafx.fxml.FXML
    private TableView<GenerateSalarySheet> GenerateSalarySheetTV;
    @javafx.fxml.FXML
    private ComboBox<String> MonthComboBox;
    @javafx.fxml.FXML
    private TextField NetSalaryTF;
    @javafx.fxml.FXML
    private TableColumn<GenerateSalarySheet, String> EmployeeIDTC;
    @javafx.fxml.FXML
    private TextField EmployeeIDTF;
    @javafx.fxml.FXML
    private TableColumn<GenerateSalarySheet, String> NetSalaryTC;

    @javafx.fxml.FXML
    public void initialize() {
        MonthComboBox.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        DepartmentCB.getItems().addAll("Administration", "Engineering", "Finance and Accounts", "Procurement", "Operations");

        EmployeeIDTC.setCellValueFactory(new PropertyValueFactory<GenerateSalarySheet , String>("EmployeeID"));
        MonthTC.setCellValueFactory(new PropertyValueFactory<GenerateSalarySheet , String>("Month"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<GenerateSalarySheet , String>("Department"));
        NetSalaryTC.setCellValueFactory(new PropertyValueFactory<GenerateSalarySheet , String>("NetSalary"));
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
    public void GenerateSalarySheetOA(ActionEvent actionEvent) {
        if (EmployeeIDTF.getText().isEmpty() || MonthComboBox.getValue() == null || DepartmentCB.getValue() == null || NetSalaryTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.show();
            return;
        }

        GenerateSalarySheet g = new GenerateSalarySheet(
                EmployeeIDTF.getText(),
                MonthComboBox.getValue(),
                DepartmentCB.getValue(),
                Integer.parseInt(NetSalaryTF.getText()));

        SalarySheetList.add(g);
        GenerateSalarySheetTV.getItems().add(g);
        GenerateSalarySheetTV.refresh();
    }


}