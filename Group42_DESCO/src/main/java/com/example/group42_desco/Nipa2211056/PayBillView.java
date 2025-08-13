package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PayBillView {

    @FXML
    private TableColumn<?, ?> BillAmountColumn;

    @FXML
    private TableColumn<?, ?> BillingMonColumn;

    @FXML
    private TableColumn<?, ?> CnameColumn;

    @FXML
    private TableColumn<?, ?> DuedateColumn;

    @FXML
    private TableColumn<?, ?> MeterNoColumn;

    @FXML
    private TableView<?> PayBillTableview;

    @FXML
    private TextArea Pdatetextarea;

    @FXML
    private TextArea Pstatustextarea;

    @FXML
    private TableColumn<?, ?> StatusColumn;

    @FXML
    void BacktoDBOnaction(ActionEvent event) {

    }

    @FXML
    void PbillOnaction(ActionEvent actionEvent) {


    }

    @FXML
    void PhistoryOnaction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/PaymentHistory_View.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Payment History");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    public void initialize() {
    }

    @FXML
    public void makePaymentOnaction(ActionEvent actionEvent) {
    }
}
