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
import static com.example.group42_desco.Sakira.ViewSalarySheet1.SalarySheetList;

public class ViewSalarySheet1Controller
{
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> MonthTC;
    @javafx.fxml.FXML
    private ComboBox<String> MonthCB;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> NetSalaryTC;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> DepartmentTC;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private TextField NetSalaryTF;
    @javafx.fxml.FXML
    private TableView<ViewSalarySheet1> SalarySheetTV;
    @javafx.fxml.FXML
    private TextField EmployeeIDTF;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> EmployeeIDTC;

    @javafx.fxml.FXML
    public void initialize() {
        MonthCB.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        DepartmentCB.getItems().addAll("Administration", "Engineering", "Finance and Accounts", "Procurement", "Operations");

        EmployeeIDTC.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("EmployeeID"));
        MonthTC.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("Month"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("Department"));
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
        if (EmployeeIDTF.getText().isEmpty() || MonthCB.getValue() == null || DepartmentCB.getValue() == null || NetSalaryTF.getText().isEmpty()) {

                Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
                errorAlert.setTitle("Input Error");
                errorAlert.setHeaderText(null); // No header
                errorAlert.setContentText("Please ensure all fields are filled out correctly.");
                errorAlert.showAndWait();
                return;
        }

        ViewSalarySheet1 b = new ViewSalarySheet1(
                EmployeeIDTF.getText(),
                MonthCB.getValue(),
                DepartmentCB.getValue(),
                Integer.parseInt(NetSalaryTF.getText())

        );

        SalarySheetList.add(b);
        SalarySheetTV.getItems().add(b);
        SalarySheetTV.refresh();


    }
}