package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PayBillView {

    @FXML
    private TableColumn<PayBill, Double> BillAmountColumn;

    @FXML
    private TableColumn<PayBill, String> BillingMonColumn;

    @FXML
    private TableColumn<PayBill, String> CnameColumn;

    @FXML
    private TableColumn<PayBill, String> DuedateColumn;

    @FXML
    private TableColumn<PayBill, String> MeterNoColumn;

    @FXML
    private TableView<PayBill> PayBillTableview;

    @FXML
    private TextArea Pdatetextarea;

    @FXML
    private TextArea Pstatustextarea;

    @FXML
    private TableColumn<PayBill, String> StatusColumn;
    @FXML
    private Label warningLabel;
    @FXML
    private TextField MnumberTextField;
    @FXML
    private TextField StatusTextField;
    @FXML
    private TextField CnameTextField;
    @FXML
    private TextField BillAmountTextField;
    @FXML
    private TextField DueDateTextField;
    @FXML
    private TextField BmonthTextField;

    @FXML
    void BacktoDBOnaction(ActionEvent actionEvent) {

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

    ObservableList<PayBill> paybillList = FXCollections.observableArrayList();

    @FXML
    void PhistoryOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/PaymentHistory_View.fxml"));
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

        CnameColumn.setCellValueFactory(new PropertyValueFactory<PayBill, String>("customername"));
        MeterNoColumn.setCellValueFactory(new PropertyValueFactory<PayBill, String>("meternumber"));
        BillingMonColumn.setCellValueFactory(new PropertyValueFactory<PayBill, String>("billingmonth"));
        MeterNoColumn.setCellValueFactory(new PropertyValueFactory<PayBill, String>("meternumber"));
        DuedateColumn.setCellValueFactory(new PropertyValueFactory<PayBill, String>("duedate"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<PayBill, String>("status"));
        BillAmountColumn.setCellValueFactory(new PropertyValueFactory<PayBill, Double>("billamount"));

        paybillList.add(new PayBill("Nipa", "12345", "March", "2025-03-31", "Paid", 500.75));
        paybillList.add(new PayBill("Nipa", "12346", "January", "2025-01-30", "Paid", 1000.00));
        paybillList.add(new PayBill("Nipa", "12347", "June", "2025-06-30", "Unpaid", 5500.00));
        paybillList.add(new PayBill("Nipa", "12348", "May", "2025-05-30", "Unpaid", 500.00));


//        Pstatustextarea.setText("DUE");
//        Pdatetextarea.setText("2025-03-31");

    }

    @FXML
    public void VOnaction(ActionEvent actionEvent) {

        boolean digitFound = false;
        for (int i = 0; i < CnameTextField.getText().length(); i++) {
            if (CnameTextField.getText().charAt(i) >= '0' && CnameTextField.getText().charAt(i) <= '9')
                digitFound = true;
        }

        if (MnumberTextField.getText().isEmpty() ||
                CnameTextField.getText().isEmpty() ||
                BmonthTextField.getText().isEmpty() ||
                //dobDatePicker.getValue().isAfter(LocalDate.now()) ||
                digitFound) {
            warningLabel.setText("Please Fill up the Required Fields Properly");


        } else {
            PayBill pbill = new PayBill(this.CnameTextField.getText(), this.MnumberTextField.getText(), this.BmonthTextField.getText(), this.DueDateTextField.getText(),
                    this.StatusTextField.getText(), Double.parseDouble(this.BillAmountTextField.getText()));
            paybillList.add(pbill);
            PayBillTableview.getItems().add(pbill);
            warningLabel.setText("Successful!");
        }

        String name = CnameTextField.getText();
        for (PayBill Paybill: paybillList){
            if (Objects.equals(Paybill.getBillamount(),BillAmountTextField)){
                CnameTextField.setText(Paybill.getCustomername());
                MnumberTextField.setText(Paybill.getMeternumber());

            }

        }

    }

    @FXML
    public void makePaymentOnaction(ActionEvent actionEvent) {
//        PayBillTableview.getItems().add(paybillList);
//
//        if (paybillList == null) {
//            paybillList = new ArrayList<>();
//
//            for (PayBill payBill : paybillList) {
//                if (payBill.getMeternumber().equals("meternumber")) {
//                    payBill.setStatus("Paid");
        //}
//        }
//    }

//}

    }
}