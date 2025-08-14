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

public class GenerateBalanceSheetController
{
    @javafx.fxml.FXML
    private TableView ViewBalanceSheetTV;
    @javafx.fxml.FXML
    private TableColumn LiabilitiesTC;
    @javafx.fxml.FXML
    private ComboBox DesiredMonthCB;
    @javafx.fxml.FXML
    private TableColumn EquityBreakdownTC;
    @javafx.fxml.FXML
    private ComboBox FiscalYearCB;
    @javafx.fxml.FXML
    private TableColumn AssetsTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
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
    }
}