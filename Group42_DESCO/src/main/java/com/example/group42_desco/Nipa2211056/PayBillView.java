package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
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
    private TextField MnumberTextField;
    @FXML
    private TextField CnameTextField;
    @FXML
    private TextField BmonthTextField;
    @FXML
    private Label warningLabel;
    @FXML
    private TextField StatusTextField;
    @FXML
    private TextField DueDateTextField;
    @FXML
    private TextField BillAmountTextField;

    @FXML
    void BacktoDBOnaction(ActionEvent actionEvent) {

    }

    ArrayList<PayBill> paybillList;

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
//        PayBillTableview.getItems().add(new PayBill("Nipa", "12346", "March", "2025-03-31", "Unpaid", 500.75));
//        PayBillTableview.getItems().add(new PayBill("Nipa", "12346", "January", "2025-01-30", "Paid", 500.00));
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

            PayBill paybillList = new PayBill(this.CnameTextField.getText(), this.MnumberTextField.getText(), this.BmonthTextField.getText(), this.DueDateTextField.getText(),
                    this.StatusTextField.getText(), Double.parseDouble(this.BillAmountTextField.getText()));
            this.paybillList.add(paybillList);
        }

//        @FXML
//        public void makePaymentOnaction; (ActionEvent actionEvent){
//
//        }

        if (paybillList == null) {
            paybillList = new ArrayList<>();

            for (PayBill payBill : paybillList) {
                if (payBill.getMeternumber().equals("meternumber")) {
                    payBill.setStatus("Paid");
                }
            }

            try {
                File f = new File("PayBill.txt");
                FileWriter fw = null;
                if (f.exists()) {
                    fw = new FileWriter(f, false);
                } else {
                    fw = new FileWriter(f);
                }
                String str = "";
                for (PayBill c : paybillList) {
                    str += c.toString("for file writing");
                }
                fw.write(str);
                fw.close();
            } catch (IOException e) {
                //
            }
        }

    }
}

