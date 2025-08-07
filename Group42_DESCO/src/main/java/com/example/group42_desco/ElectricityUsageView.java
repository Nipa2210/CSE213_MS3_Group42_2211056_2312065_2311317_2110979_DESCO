package com.example.group42_desco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class ElectricityUsageView {

    @FXML
    private TableColumn<?, ?> BillMonthColumn;

    @FXML
    private TableColumn<?, ?> CostColumn;

    @FXML
    private TableColumn<?, ?> UnitsconsumedColumn;

    @FXML
    void backtoDashboardOnaction(ActionEvent event) {

    }

    @FXML
    public void initialize() {
    }

}

