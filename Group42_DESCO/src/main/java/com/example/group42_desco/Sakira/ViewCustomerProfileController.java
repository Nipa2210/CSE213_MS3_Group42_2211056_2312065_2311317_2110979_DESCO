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
import static com.example.group42_desco.Sakira.ViewCustomerProfile.CustomerProfileList;

public class ViewCustomerProfileController
{
    @javafx.fxml.FXML
    private TableColumn<ViewCustomerProfile , String> CustomerNameTC;
    @javafx.fxml.FXML
    private TableColumn<ViewCustomerProfile , String> BloodGroupTC;
    @javafx.fxml.FXML
    private ComboBox<String> BloodGroupCB;
    @javafx.fxml.FXML
    private TextField CustomerNameTF;
    @javafx.fxml.FXML
    private TextField CustomerIDTF;
    @javafx.fxml.FXML
    private TableColumn<ViewCustomerProfile , String> CustomerIDTC;
    @javafx.fxml.FXML
    private TextField CustomerAreaTF;
    @javafx.fxml.FXML
    private TableView<ViewCustomerProfile> ViewCustomerProfileTV;
    @javafx.fxml.FXML
    private TableColumn<ViewCustomerProfile , String> ContactDetailsTC;
    @javafx.fxml.FXML
    private TableColumn<ViewCustomerProfile , String> CustomerAreaTC;
    @javafx.fxml.FXML
    private TextField ContactDetailsTF;

    @javafx.fxml.FXML
    public void initialize() {
        BloodGroupCB.getItems().addAll("A+" , "A-" , "B+" , "B-" , "O+" , "O-" , "AB+" , "AB-");

        CustomerNameTC.setCellValueFactory(new PropertyValueFactory<ViewCustomerProfile , String>("CustomerName"));
        CustomerIDTC.setCellValueFactory(new PropertyValueFactory<ViewCustomerProfile , String>("CustomerID"));
        CustomerAreaTC.setCellValueFactory(new PropertyValueFactory<ViewCustomerProfile , String>("CustomerArea"));
        ContactDetailsTC.setCellValueFactory(new PropertyValueFactory<ViewCustomerProfile , String>("ContactDetails"));
        BloodGroupTC.setCellValueFactory(new PropertyValueFactory<ViewCustomerProfile , String>("BloodGroup"));
    }



    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/MDDashBoard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("MD DashBoard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void ViewOA(ActionEvent actionEvent) {
        if (CustomerNameTF.getText().isEmpty() || CustomerIDTF.getText().isEmpty() || CustomerAreaTF.getText().isEmpty() || ContactDetailsTF.getText().isEmpty() || BloodGroupCB.getValue() == null) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        ViewCustomerProfile v = new ViewCustomerProfile(
                CustomerNameTF.getText(),
                CustomerIDTF.getText(),
                CustomerAreaTF.getText(),
                Integer.parseInt(ContactDetailsTF.getText()),
                BloodGroupCB.getValue()
        );

        CustomerProfileList.add(v);
        ViewCustomerProfileTV.getItems().add(v);
        ViewCustomerProfileTV.refresh();
    }
}