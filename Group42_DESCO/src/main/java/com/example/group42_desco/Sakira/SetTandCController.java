package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class SetTandCController
{
    @javafx.fxml.FXML
    private Label EditOrAddNewTermsLabel;
    @javafx.fxml.FXML
    private ComboBox<String> SelectsEmployeeCategoryCB;
    @javafx.fxml.FXML
    private TextField TermsAndConditionsTF;
    @javafx.fxml.FXML
    private TextArea SetUpTandCTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        SelectsEmployeeCategoryCB.getItems().addAll("Permanent", "Contractual", "Admin", "Technical");
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
    public void ShowOA(ActionEvent actionEvent) {
        SetUpTandCTextArea.getText();
        if (TermsAndConditionsTF == null || TermsAndConditionsTF.getText().isEmpty()){
            SetUpTandCTextArea.setText("New Terms and Conditions");

            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.show();
            return;


        }


    }
}