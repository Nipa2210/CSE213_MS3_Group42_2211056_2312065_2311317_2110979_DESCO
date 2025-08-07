package com.example.group42_desco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class PayBillView {

    @FXML
    private TableColumn<?, ?> BillAmountColumn;

    @FXML
    private TableColumn<?, ?> BillingMonColumn;

    @FXML
    private TableColumn<?, ?> CnameColumn;

    @FXML
    private TableColumn<?, ?> DuedateColumn;

    @FXML
    private TableColumn<?, ?> MeterNoColumn;

    @FXML
    private TableView<?> PayBillTableview;

    @FXML
    private TextArea Pdatetextarea;

    @FXML
    private TextArea Pstatustextarea;

    @FXML
    private TableColumn<?, ?> StatusColumn;

    @FXML
    void BacktoDBOnaction(ActionEvent event) {

    }

    @FXML
    void PbillOnaction(ActionEvent event) {

    }

    @FXML
    void PhistoryOnaction(ActionEvent event) {

    }

    @FXML
    public void initialize() {
    }

    @FXML
    public void makePaymentOnaction(ActionEvent actionEvent) {
    }
}
