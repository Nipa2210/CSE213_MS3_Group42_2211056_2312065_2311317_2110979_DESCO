package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

import static com.example.group42_desco.Sakira.MakePaymentsToSuppliers.SupplierPaymentList;
import static com.example.group42_desco.Sakira.PenaltyForDelayedPayments.PaymentsList;

public class MakePaymentsToSuppliersController {
    @javafx.fxml.FXML
    private TableView<MakePaymentsToSuppliers> MakePaymentsToSuppliersTV;
    @javafx.fxml.FXML
    private TableColumn<MakePaymentsToSuppliers, String> PaymentMethodTC;
    @javafx.fxml.FXML
    private ComboBox<String> ChoosePaymentMethodCB;
    @javafx.fxml.FXML
    private TableColumn<MakePaymentsToSuppliers, String> AmountTC;
    @javafx.fxml.FXML
    private TableColumn<MakePaymentsToSuppliers, String> ReferenceNumberTC;
    @javafx.fxml.FXML
    private TableColumn<MakePaymentsToSuppliers, String> DateTC;
    @javafx.fxml.FXML
    private TextField ReferenceNumberTF;
    @javafx.fxml.FXML
    private TextField AmountTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextField SupplierIDTF;
    @javafx.fxml.FXML
    private TableColumn<MakePaymentsToSuppliers, String> SupplierIDTC;


    @javafx.fxml.FXML
    public void initialize() {
        ChoosePaymentMethodCB.getItems().addAll("Cash", "Online Payment", "BankPayment");
        DateDP.setValue(LocalDate.now());

        AmountTC.setCellValueFactory(new PropertyValueFactory<MakePaymentsToSuppliers, String>("Amount"));
        DateTC.setCellValueFactory(new PropertyValueFactory<MakePaymentsToSuppliers, String>("Date"));
        ReferenceNumberTC.setCellValueFactory(new PropertyValueFactory<MakePaymentsToSuppliers, String>("ReferenceNumber"));
        PaymentMethodTC.setCellValueFactory(new PropertyValueFactory<MakePaymentsToSuppliers, String>("PaymentMethod"));
        SupplierIDTC.setCellValueFactory(new PropertyValueFactory<MakePaymentsToSuppliers, String>("SupplierID"));
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
    public void ConfirmPaymentOA(ActionEvent actionEvent) {
        if (AmountTF.getText().isEmpty() || DateDP.getValue() == null || ReferenceNumberTF.getText().isEmpty() || ChoosePaymentMethodCB.getValue() == null || SupplierIDTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.show();
            return;
        }

        MakePaymentsToSuppliers p = new MakePaymentsToSuppliers(
                Integer.parseInt(AmountTF.getText()),
                DateDP.getValue(),
                Integer.parseInt(ReferenceNumberTF.getText()),
                ChoosePaymentMethodCB.getValue(),
                SupplierIDTF.getText()
        );

        SupplierPaymentList.add(p);
        MakePaymentsToSuppliersTV.getItems().add(p);
        MakePaymentsToSuppliersTV.refresh();
    }


}