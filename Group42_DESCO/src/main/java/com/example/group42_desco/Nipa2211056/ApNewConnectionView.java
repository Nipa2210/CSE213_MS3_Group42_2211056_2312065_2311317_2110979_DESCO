package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class ApNewConnectionView {

    @FXML
    private TextField Addresstextfield;

    @FXML
    private TextField Nametextfield;

    @FXML
    private TextField Phonenotextfield;

    @FXML
    private TextField Professiontextfield;

    @FXML
    private TextArea msgTextarea;

    @FXML
    private TextField nidNotextfield;
    @FXML
    private RadioButton Femaleradiobutton;
    @FXML
    private RadioButton Maleradiobutton;

    //ArrayList<ApNewConnection> NewconectionList;
    @FXML
    private Label warningLabel;

    @FXML
    private void initialize() {
        //NewconectionList = new ArrayList<>();
        ToggleGroup tg = new ToggleGroup();
        Femaleradiobutton.setToggleGroup(tg);
        Maleradiobutton.setToggleGroup(tg);

    }


    @FXML
    void applyButtonOnaction(ActionEvent actionEvent) {
        boolean digitFound = false;
        for (int i = 0; i < Nametextfield.getText().length(); i++) {
            if (Nametextfield.getText().charAt(i) >= '0' && Addresstextfield.getText().charAt(i) <= '9') {
                digitFound = true;
            }
        }
        if (Nametextfield.getText().isEmpty() || Addresstextfield.getText().isEmpty() || digitFound) {
            warningLabel.setText("Fill up the form properly.");
            warningLabel.setStyle("-fx-border-color: red");
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Fill up the form properly");
            errorAlert.show();
//        } else {
//            boolean sameNameFound = false;
//            for (ApNewConnection s : NewconectionList) {
//                if (s.getName().equals(Nametextfield.getText())) {
//                    sameNameFound = true;
//                }
//            }
//            if (sameNameFound) {
//                Alert sameNameError = new Alert(Alert.AlertType.ERROR);
//                sameNameError.setContentText("Same Name Found");
//                sameNameError.show();
            }
            else {
                warningLabel.setText("Application Successful!");
            }
            String selectedGender = "";
            if(Femaleradiobutton.isSelected()){
                selectedGender = "Female";
            }
            else{
                selectedGender = "Male";
        }

    }

    @FXML
    public void BackButtonOnaction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CustomerDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
