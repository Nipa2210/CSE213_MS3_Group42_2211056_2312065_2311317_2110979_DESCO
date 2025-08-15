package com.example.group42_desco.Sakira;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import static com.example.group42_desco.Sakira.ViewCustomerProfile.CustomerProfileList;
import static com.example.group42_desco.Sakira.ViewElectricityStorage.StorageList;

public class ViewElectricityStorageController
{
    @javafx.fxml.FXML
    private TableColumn<ViewElectricityStorage , String> ItemNameTC;
    @javafx.fxml.FXML
    private TableColumn<ViewElectricityStorage , String> QuantityTC;
    @javafx.fxml.FXML
    private TableView<ViewElectricityStorage> ViewElectricityStorageTV;
    @javafx.fxml.FXML
    private TableColumn<ViewElectricityStorage , String> LocationTC;
    @javafx.fxml.FXML
    private TextField StatusTF;
    @javafx.fxml.FXML
    private TableColumn<ViewElectricityStorage , String> StatusTC;
    @javafx.fxml.FXML
    private TextField ItemNameTF;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private TextField LocationTF;

    @javafx.fxml.FXML
    public void initialize() {
        ItemNameTC.setCellValueFactory(new PropertyValueFactory<ViewElectricityStorage , String>("ItemName"));
        QuantityTC.setCellValueFactory(new PropertyValueFactory<ViewElectricityStorage , String>("Quantity"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<ViewElectricityStorage , String>("Location"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<ViewElectricityStorage , String>("Status"));
    }



    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void UpdatesandDisplaysFilteredResultsOA(ActionEvent actionEvent) {
        if (ItemNameTF.getText().isEmpty() || QuantityTF.getText().isEmpty() || LocationTF.getText().isEmpty() || StatusTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        ViewElectricityStorage y = new ViewElectricityStorage(
                ItemNameTF.getText(),
                Integer.parseInt(QuantityTF.getText()),
                LocationTF.getText(),
                StatusTF.getText());

        StorageList.add(y);
        ViewElectricityStorageTV.getItems().add(y);
        ViewElectricityStorageTV.refresh();
    }
}