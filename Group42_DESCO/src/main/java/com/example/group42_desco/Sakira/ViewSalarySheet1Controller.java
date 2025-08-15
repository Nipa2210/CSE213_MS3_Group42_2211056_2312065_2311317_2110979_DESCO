package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import static com.example.group42_desco.Sakira.ViewSalarySheet1.SalarySheetList;

public class ViewSalarySheet1Controller
{
    @javafx.fxml.FXML
    private TableView<ViewSalarySheet1> ViewSalarySheetTV;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> MonthTC2;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> NetSalaryTC2;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> EmployeeIDTC2;
    @javafx.fxml.FXML
    private TableColumn<ViewSalarySheet1 , String> DepartmentTC2;

    @javafx.fxml.FXML
    public void initialize() {


        EmployeeIDTC2.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("EmployeeID"));
        MonthTC2.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("Month"));
        DepartmentTC2.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("Department"));
        NetSalaryTC2.setCellValueFactory(new PropertyValueFactory<ViewSalarySheet1 , String>("NetSalary"));

        ViewSalarySheetTV.getItems().addAll(SalarySheetList);
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