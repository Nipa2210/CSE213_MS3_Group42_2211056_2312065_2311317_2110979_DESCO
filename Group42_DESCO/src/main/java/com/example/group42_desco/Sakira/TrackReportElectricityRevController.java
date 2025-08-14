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

public class TrackReportElectricityRevController
{
    @javafx.fxml.FXML
    private ComboBox PaymentMethodCB;
    @javafx.fxml.FXML
    private ComboBox BillingPeriodCB;
    @javafx.fxml.FXML
    private ComboBox ZoneCB;
    @javafx.fxml.FXML
    private TableColumn PaymentMethodTC;
    @javafx.fxml.FXML
    private TextField TotalCollectedRevenueTF;
    @javafx.fxml.FXML
    private TableColumn BillingPeriodTC;
    @javafx.fxml.FXML
    private TableColumn ZoneTC;
    @javafx.fxml.FXML
    private TableColumn TotalCollectedRevenueTC;
    @javafx.fxml.FXML
    private TableView TrackandReportElectricityRevTV;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewOA(ActionEvent actionEvent) {
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