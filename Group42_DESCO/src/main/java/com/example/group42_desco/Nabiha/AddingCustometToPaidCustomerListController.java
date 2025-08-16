package com.example.group42_desco.Nabiha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddingCustometToPaidCustomerListController {
    @javafx.fxml.FXML
    private TextField TransactionNoTextfield;
    @javafx.fxml.FXML
    private TableView<BRSDPaidCustomer> PaidCustomerTableView;
    @javafx.fxml.FXML
    private TableColumn<BRSDPaidCustomer, String> NameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BRSDPaidCustomer, String> TransactionNoTableColumn;
    @javafx.fxml.FXML
    private TextField TotalBillTextfield;
    @javafx.fxml.FXML
    private TextField CustomerNameTextfield;
    @javafx.fxml.FXML
    private TableColumn<BRSDPaidCustomer, String> IDTableColumn;
    @javafx.fxml.FXML
    private TextField CustomerIDTextfield;
    @javafx.fxml.FXML
    private TableColumn<BRSDPaidCustomer, Integer> TotalBillTableColumn;

    private ObservableList<BRSDPaidCustomer> paidCustomerList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        IDTableColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        TotalBillTableColumn.setCellValueFactory(new PropertyValueFactory<>("TotalBill"));
        TransactionNoTableColumn.setCellValueFactory(new PropertyValueFactory<>("TransactionNo"));
        PaidCustomerTableView.setItems(paidCustomerList);
    }

    @javafx.fxml.FXML
    public void AddToPaidCustomerListOnAction(ActionEvent actionEvent) {
        if (CustomerNameTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide a name");
            erroralert.show();
            return;
        }
        if (CustomerIDTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide a staff ID");
            erroralert.show();
            return;
        }
        if (TotalBillTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide total bill");
            erroralert.show();
            return;
        }
        if (TransactionNoTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide transaction number");
            erroralert.show();
            return;
        }

        int totalbill;
        try {
            totalbill = Integer.parseInt(TotalBillTextfield.getText());
        } catch (NumberFormatException e) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Invalid total bill");
            erroralert.show();
            return;
        }

        BRSDPaidCustomer s = new BRSDPaidCustomer(
                CustomerNameTextfield.getText(),
                CustomerIDTextfield.getText(),
                totalbill,
                TransactionNoTextfield.getText()

        );

        paidCustomerList.add(s);  // Add to the ObservableList

        CustomerNameTextfield.clear();
        TotalBillTextfield.clear();
        CustomerIDTextfield.clear();
        TransactionNoTextfield.clear();
    }
}
