package com.example.group42_desco.Nipa2211056;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
                UnitsConsumedTextfield.getText().isEmpty()
        );
        warningLabel.setText("Error");
        this.warningLabel.setStyle("-fx-border-color: Red");

        EUsage usagetobeAdded = new EUsage(this.BillingMonthTextfield.getText(),Double.parseDouble(this.CostTextfield.getText()),Integer.parseInt(this.UnitsConsumedTextfield.getText()));
        this.EUsageList.add(usagetobeAdded);
        this.ElecUsageTableView.getItems().add(usagetobeAdded);
        this.warningLabel.setText("EUsage Added Successfully");
        this.warningLabel.setStyle("-fx-border-color: Green");

    }
}

