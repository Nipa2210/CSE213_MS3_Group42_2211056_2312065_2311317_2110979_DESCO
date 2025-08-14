package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.CreateEBill.EBillList;

public class CreateEBillController
{
    @javafx.fxml.FXML
    private TableColumn<CreateEBill , String> CustomerNameTC;
    @javafx.fxml.FXML
    private TableColumn<CreateEBill , String> TotalAmountTC;
    @javafx.fxml.FXML
    private TableView<CreateEBill> CreateEBillTV;
    @javafx.fxml.FXML
    private TableColumn<CreateEBill , String> CustomerIDTC;
    @javafx.fxml.FXML
    private TableColumn<CreateEBill , String> MeterNumberTC;
    @javafx.fxml.FXML
    private TextField CustomerNameTF;
    @javafx.fxml.FXML
    private TextField CustomerIDTF;
    @javafx.fxml.FXML
    private TextField MeterNumberTF;
    @javafx.fxml.FXML
    private TextField TotalAmountTF;

    @javafx.fxml.FXML
    public void initialize() {
        CustomerIDTC.setCellValueFactory(new PropertyValueFactory<CreateEBill , String>("CustomerID"));
        CustomerNameTC.setCellValueFactory(new PropertyValueFactory<CreateEBill , String>("CustomerName"));
        MeterNumberTC.setCellValueFactory(new PropertyValueFactory<CreateEBill , String>("MeterNumber"));
        TotalAmountTC.setCellValueFactory(new PropertyValueFactory<CreateEBill , String>("TotalAmount"));
    }



    @javafx.fxml.FXML
    public void CreateEBillOA(ActionEvent actionEvent) {
        if (CustomerIDTF.getText().isEmpty() || CustomerNameTF.getText().isEmpty() || MeterNumberTF.getText().isEmpty() || TotalAmountTF.getText().isEmpty()){
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Please ensure all the fields are filled out correctly");
            errorAlert.show();
            return;
        }

        CreateEBill e = new CreateEBill(
                CustomerIDTF.getText(),
                CustomerNameTF.getText(),
                Integer.parseInt(MeterNumberTF.getText()),
                Integer.parseInt(TotalAmountTF.getText()));

        EBillList.add(e);
        CreateEBillTV.getItems().add(e);
        CreateEBillTV.refresh();

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


}