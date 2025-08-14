package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewSalarySheet1Controller
{
    @javafx.fxml.FXML
    private TableColumn MonthTC;
    @javafx.fxml.FXML
    private ComboBox MonthCB;
    @javafx.fxml.FXML
    private TableColumn NetSalaryTC;
    @javafx.fxml.FXML
    private TableColumn DepartmentTC;
    @javafx.fxml.FXML
    private ComboBox DepartmentCB;
    @javafx.fxml.FXML
    private TextField NetSalaryTF;
    @javafx.fxml.FXML
    private TableView SalarySheetTV;
    @javafx.fxml.FXML
    private TableColumn EmployeeName;
    @javafx.fxml.FXML
    private TextField EmployeeNameTF;

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