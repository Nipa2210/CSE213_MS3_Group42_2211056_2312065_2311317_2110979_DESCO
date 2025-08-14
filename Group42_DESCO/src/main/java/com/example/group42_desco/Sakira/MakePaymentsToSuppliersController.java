package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MakePaymentsToSuppliersController
{
    @javafx.fxml.FXML
    private TextField SuppliersToBePaidTF;
    @javafx.fxml.FXML
    private TableView MakePaymentsToSuppliersTV;
    @javafx.fxml.FXML
    private TableColumn PaymentMethodTC;
    @javafx.fxml.FXML
    private ComboBox ChoosePaymentMethodCB;
    @javafx.fxml.FXML
    private TableColumn AmountTC;
    @javafx.fxml.FXML
    private TableColumn ReferenceNumberTC;
    @javafx.fxml.FXML
    private Label SendMailLabel;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TextField ReferenceNumberTF;
    @javafx.fxml.FXML
    private TextField AmountTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;

    @javafx.fxml.FXML
    public void initialize() {
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
    public void SendMailOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmPaymentOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void InvoiceForPaymentOA(ActionEvent actionEvent) {
    }
}