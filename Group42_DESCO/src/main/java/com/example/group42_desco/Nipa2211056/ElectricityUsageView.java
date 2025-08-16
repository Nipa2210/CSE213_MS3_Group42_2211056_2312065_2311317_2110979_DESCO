package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ElectricityUsageView {

    @FXML
    private TableColumn<EUsage, String> BillMonthColumn;

    @FXML
    private TableColumn<EUsage, Double> CostColumn;

    @FXML
    private TableColumn<EUsage, Integer> UnitsconsumedColumn;
    @FXML
    private TextField UnitsConsumedTextfield;
    @FXML
    private TextField CostTextfield;
    @FXML
    private TextField BillingMonthTextfield;
    @FXML
    private TableView ElecUsageTableView;

    ArrayList<EUsage> EUsageList;
    @FXML
    private Label warningLabel;

    @FXML
    void backtoDashboardOnaction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CustomerDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Payment History");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    public void initialize() {
        this.EUsageList = new ArrayList<>();
        this.BillMonthColumn.setCellValueFactory(new PropertyValueFactory<>("Billingmonth"));
        this.BillMonthColumn.setCellValueFactory(new PropertyValueFactory<>("Cost"));
        this.UnitsconsumedColumn.setCellValueFactory(new PropertyValueFactory<>("Unitsconsumed"));


    }

    @FXML
    public void AddOnaction(ActionEvent actionEvent) {
        if (BillingMonthTextfield.getText().isEmpty() ||
                CostTextfield.getText().isEmpty() ||
                UnitsConsumedTextfield.getText().isEmpty()){
            warningLabel.setText("Error");
            this.warningLabel.setStyle("-fx-border-color: Red");

        }
        else{
            EUsage usagetobeAdded = new EUsage(this.BillingMonthTextfield.getText(),Double.parseDouble(this.CostTextfield.getText()),Integer.parseInt(this.UnitsConsumedTextfield.getText()));
            this.EUsageList.add(usagetobeAdded);
            this.ElecUsageTableView.getItems().addAll(usagetobeAdded);
            this.warningLabel.setText("EUsage Added Successfully");
            this.warningLabel.setStyle("-fx-border-color: Green");

        }
        BillingMonthTextfield.clear();
        CostTextfield.clear();
        UnitsConsumedTextfield.clear();

//        EUsage usagetobeAdded = new EUsage(this.BillingMonthTextfield.getText(),Double.parseDouble(this.CostTextfield.getText()),Integer.parseInt(this.UnitsConsumedTextfield.getText()));
//        this.EUsageList.add(usagetobeAdded);
//        this.ElecUsageTableView.getItems().add(usagetobeAdded);
//        this.warningLabel.setText("EUsage Added Successfully");
//        this.warningLabel.setStyle("-fx-border-color: Green");

    }
}

