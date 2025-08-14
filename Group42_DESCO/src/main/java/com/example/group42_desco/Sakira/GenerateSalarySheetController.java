package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class GenerateSalarySheetController
{
    @javafx.fxml.FXML
    private TableColumn GenerateSalarySheetTC;
    @javafx.fxml.FXML
    private TableColumn MonthTC;
    @javafx.fxml.FXML
    private ComboBox DepartmentCB;
    @javafx.fxml.FXML
    private TableColumn DepartmentTC;
    @javafx.fxml.FXML
    private ComboBox PaymentTypeCB;
    @javafx.fxml.FXML
    private TableColumn PaymentTypeTC;
    @javafx.fxml.FXML
    private TableView GenerateSalarySheetTV;
    @javafx.fxml.FXML
    private ComboBox MonthComboBox;
    @javafx.fxml.FXML
    private TableColumn PaymentTypeTC1;

    @javafx.fxml.FXML
    public void initialize() {
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
    }


}