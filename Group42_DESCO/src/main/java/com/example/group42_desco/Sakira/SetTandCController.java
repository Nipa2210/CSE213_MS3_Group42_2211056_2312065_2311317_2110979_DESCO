package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SetTandCController
{
    @javafx.fxml.FXML
    private Label EditOrAddNewTermsLabel;
    @javafx.fxml.FXML
    private ComboBox SelectsEmployeeCategoryCB;
    @javafx.fxml.FXML
    private TextField TermsandConditionsTF;
    @javafx.fxml.FXML
    private TextArea SetUpTandCTextArea;

    @javafx.fxml.FXML
    public void initialize() {
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
    }
}