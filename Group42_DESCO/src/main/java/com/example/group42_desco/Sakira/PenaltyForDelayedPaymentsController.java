package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PenaltyForDelayedPaymentsController
{
    @javafx.fxml.FXML
    private TableColumn UpdatedTotalElectricityBillTC;
    @javafx.fxml.FXML
    private TableColumn AddedChargeTC;
    @javafx.fxml.FXML
    private TableView PenaltyForDelayedElectricityPaymentsTV;
    @javafx.fxml.FXML
    private TableColumn PreviousBillTC;
    @javafx.fxml.FXML
    private TextField AddedChargeTF;
    @javafx.fxml.FXML
    private TextField PreviousBillTF;
    @javafx.fxml.FXML
    private TextField UpdatedTotalElectricityBillTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateBillOA(ActionEvent actionEvent) {
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