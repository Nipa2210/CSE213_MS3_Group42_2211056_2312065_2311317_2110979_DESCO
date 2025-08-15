package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.ViewSupplierProfile.SupplierProfileList;

public class ViewSupplierProfileController
{
    @javafx.fxml.FXML
    private TableColumn<ViewSupplierProfile , String> SupplierIDTC;
    @javafx.fxml.FXML
    private TableColumn<ViewSupplierProfile , String> PaymentStatusTC;
    @javafx.fxml.FXML
    private TableView<ViewSupplierProfile> ViewSupplierProfileTV;
    @javafx.fxml.FXML
    private TableColumn<ViewSupplierProfile , String> ContactInfoTC;
    @javafx.fxml.FXML
    private TextField PaymentStatusTF;
    @javafx.fxml.FXML
    private TextField ContactInfoTF;
    @javafx.fxml.FXML
    private TextField SupplierIDTF;
    @javafx.fxml.FXML
    private TextField TransectionIDTF;
    @javafx.fxml.FXML
    private TableColumn<ViewSupplierProfile , String> TransectionIDTC;

    @javafx.fxml.FXML
    public void initialize() {
        SupplierIDTC.setCellValueFactory(new PropertyValueFactory<ViewSupplierProfile , String>("SupplierID"));
        TransectionIDTC.setCellValueFactory(new PropertyValueFactory<ViewSupplierProfile , String>("TransectionID"));
        ContactInfoTC.setCellValueFactory(new PropertyValueFactory<ViewSupplierProfile , String>("ContactInfo"));
        PaymentStatusTC.setCellValueFactory(new PropertyValueFactory<ViewSupplierProfile , String>("PaymentStatus"));
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
        if (SupplierIDTF.getText().isEmpty() || TransectionIDTF.getText().isEmpty() || ContactInfoTF.getText().isEmpty() || PaymentStatusTF.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return;
        }

        ViewSupplierProfile r = new ViewSupplierProfile(
                SupplierIDTF.getText(),
                TransectionIDTF.getText(),
                Integer.parseInt(ContactInfoTF.getText()),
                PaymentStatusTF.getText()
        );

        SupplierProfileList.add(r);
        ViewSupplierProfileTV.getItems().add(r);
        ViewSupplierProfileTV.refresh();
    }
}