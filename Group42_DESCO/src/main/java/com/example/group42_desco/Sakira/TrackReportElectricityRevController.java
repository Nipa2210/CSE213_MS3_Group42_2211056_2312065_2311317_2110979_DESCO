package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.TrackReportElectricityRev.RevenueList;

public class TrackReportElectricityRevController {
    @javafx.fxml.FXML
    private ComboBox<String> PaymentMethodCB;
    @javafx.fxml.FXML
    private ComboBox<String> BillingPeriodCB;
    @javafx.fxml.FXML
    private ComboBox<String> ZoneCB;
    @javafx.fxml.FXML
    private TableColumn<TrackReportElectricityRev, String> PaymentMethodTC;
    @javafx.fxml.FXML
    private TextField TotalCollectedRevenueTF;
    @javafx.fxml.FXML
    private TableColumn<TrackReportElectricityRev, String> BillingPeriodTC;
    @javafx.fxml.FXML
    private TableColumn<TrackReportElectricityRev, String> ZoneTC;
    @javafx.fxml.FXML
    private TableColumn<TrackReportElectricityRev, String> TotalCollectedRevenueTC;
    @javafx.fxml.FXML
    private TableView<TrackReportElectricityRev> TrackReportElectricityRevTV;

    @javafx.fxml.FXML
    public void initialize() {
        BillingPeriodCB.getItems().addAll("Monthly", "Bi Monthly(Every 2Months", "Quarterly(Every 3Months");
        ZoneCB.getItems().addAll("Gulshan", "Banani", "Baridhara", "Mirpur", "Mohammadpur", "Bashundhara", "Badda");
        PaymentMethodCB.getItems().addAll("Cash", "Bank Payment", "Online Payment");

        BillingPeriodTC.setCellValueFactory(new PropertyValueFactory<TrackReportElectricityRev, String>("BillingPeriod"));
        ZoneTC.setCellValueFactory(new PropertyValueFactory<TrackReportElectricityRev, String>("Zone"));
        PaymentMethodTC.setCellValueFactory(new PropertyValueFactory<TrackReportElectricityRev, String>("PaymentMethod"));
        TotalCollectedRevenueTC.setCellValueFactory(new PropertyValueFactory<TrackReportElectricityRev, String>("TotalCollectedRevenue"));
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
    public void ViewOA(ActionEvent actionEvent) {
        if (BillingPeriodCB.getValue() == null || ZoneCB.getValue() == null || PaymentMethodCB.getValue() == null || TotalCollectedRevenueTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Please ensure all the fields are filled out correctly");
            errorAlert.show();
            return;
        }

        TrackReportElectricityRev r = new TrackReportElectricityRev(
                BillingPeriodCB.getValue(),
                ZoneCB.getValue(),
                PaymentMethodCB.getValue(),
                Integer.parseInt(TotalCollectedRevenueTF.getText()));

        RevenueList.add(r);
        TrackReportElectricityRevTV.getItems().add(r);
        TrackReportElectricityRevTV.getItems().add(r);
        TrackReportElectricityRevTV.refresh();

    }
}

