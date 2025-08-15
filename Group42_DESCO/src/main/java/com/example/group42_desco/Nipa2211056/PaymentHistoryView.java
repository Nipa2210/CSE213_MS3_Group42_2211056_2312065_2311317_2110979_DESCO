package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class PaymentHistoryView {

    @FXML
    private TableColumn<?, ?> BiilingMonthColumn;

    @FXML
    private TableColumn<?, ?> BillingStausColumn;

    @FXML
    private TableColumn<?, ?> CustomeNameColumn;

    @FXML
    private TableColumn<?, ?> MeterNumberColumn;

    @FXML
    private TableView<?> PHistoryTableView;

    @FXML
    public void initialize() {
    }

    @FXML
    public void GBOnaction(ActionEvent actionEvent) {

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

//    @FXML
//    void GBOnaction(ActionEvent event) {
//
//    }

}

