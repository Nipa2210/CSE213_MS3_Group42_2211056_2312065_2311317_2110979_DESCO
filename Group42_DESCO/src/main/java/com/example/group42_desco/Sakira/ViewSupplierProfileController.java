package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewSupplierProfileController
{
    @javafx.fxml.FXML
    private TableColumn SupplierIDTC;
    @javafx.fxml.FXML
    private TableColumn SupplierNameTC;
    @javafx.fxml.FXML
    private TableColumn PastTransactionTC;
    @javafx.fxml.FXML
    private TableColumn PaymentStatusTC;
    @javafx.fxml.FXML
    private TableView ViewSupplierProfileTV;
    @javafx.fxml.FXML
    private TableColumn ContactInfoTC;
    @javafx.fxml.FXML
    private TextField PaymentStatusTF;
    @javafx.fxml.FXML
    private TextField ContactInfoTF;
    @javafx.fxml.FXML
    private TextField SupplierIDTF;
    @javafx.fxml.FXML
    private TextField SupplierNameTF;
    @javafx.fxml.FXML
    private TextField PastTransectionsTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void SearchOA(ActionEvent actionEvent) {
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
    }
}