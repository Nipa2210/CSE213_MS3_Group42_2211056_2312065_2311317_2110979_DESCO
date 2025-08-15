package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.ApprovalOfSalarySheet.ApprovalSalarySheetList;

public class ApprovalOfSalarySheetController
{
    @javafx.fxml.FXML
    private TableView<ApprovalOfSalarySheet> ApprovalOfSalarySheetTV;
    @javafx.fxml.FXML
    private TableColumn<ApprovalOfSalarySheet , String> MonthTC;
    @javafx.fxml.FXML
    private ComboBox<String> MonthCB;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableColumn<ApprovalOfSalarySheet , String> NetSalaryTC;
    @javafx.fxml.FXML
    private TableColumn<ApprovalOfSalarySheet , String> DepartmentTC;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private TableColumn<ApprovalOfSalarySheet , String> EmployeeIDTC;
    @javafx.fxml.FXML
    private TextField NetSalaryTF;
    @javafx.fxml.FXML
    private TextField EmployeeIDTF;

    @javafx.fxml.FXML
    public void initialize() {
        MonthCB.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        DepartmentCB.getItems().addAll("Administration", "Engineering", "Finance and Accounts", "Procurement", "Operations");

        EmployeeIDTC.setCellValueFactory(new PropertyValueFactory<ApprovalOfSalarySheet , String>("EmployeeID"));
        MonthTC.setCellValueFactory(new PropertyValueFactory<ApprovalOfSalarySheet , String>("Month"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<ApprovalOfSalarySheet , String>("Department"));
        NetSalaryTC.setCellValueFactory(new PropertyValueFactory<ApprovalOfSalarySheet , String>("NetSalary"));
    }





    @javafx.fxml.FXML
    public void ApproveOA(ActionEvent actionEvent) {
        OutputLabel.setText("Approved");
        if (EmployeeIDTF.getText().isEmpty() || MonthCB.getValue() == null || DepartmentCB.getValue() == null || NetSalaryTF.getText().isEmpty()){
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        ApprovalOfSalarySheet f = new ApprovalOfSalarySheet(
                EmployeeIDTF.getText(),
                MonthCB.getValue(),
                DepartmentCB.getValue(),
                Integer.parseInt(NetSalaryTF.getText())
        );

        ApprovalSalarySheetList.add(f);
        ApprovalOfSalarySheetTV.getItems().add(f);
        ApprovalOfSalarySheetTV.refresh();


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

}