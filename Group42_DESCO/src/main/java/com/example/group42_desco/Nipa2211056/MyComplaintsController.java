package com.example.group42_desco.Nipa2211056;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MyComplaintsController {

    @FXML
    private TextField CIDTextfield;

    @FXML
    private TextField PrStatusTextfield;

    @FXML
    private TextField PrtypeTextfield;

    @FXML
    private TableView<MCs> CLTableview;
    ArrayList<MCs> MCList;

    @FXML
    private TableColumn<MCs, String> IDColumn;

    @FXML
    private TableColumn<MCs, String> StColumn;

    @FXML
    private TableColumn<MCs, String> TypeColumn;

    @FXML
    private Label warningLabel;


    @FXML
    public void initialize() {
        this.MCList = new ArrayList<>();
        this.IDColumn.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        this.TypeColumn.setCellValueFactory(new PropertyValueFactory<>("problemType"));
        this.StColumn.setCellValueFactory(new PropertyValueFactory<>("problemStatus"));
    }

    @FXML
    public void VDetailsOnaction(ActionEvent actionEvent) {

        if (CIDTextfield.getText().isEmpty() ||
                PrtypeTextfield.getText().isEmpty() ||
                PrStatusTextfield.getText().isEmpty()) {
            this.warningLabel.setText("Error");
            this.warningLabel.setStyle("-fx-border-color: Red");
        }
        else{
            MCs mycomplaintstoBeAdded = new MCs("this.CIDTextfield.getText()", "this.PrtypeTextfield.getText()", "this.PrStatusTextfield.getText()");
            this.MCList.add(mycomplaintstoBeAdded);
            this.CLTableview.getItems().add(mycomplaintstoBeAdded);
            this.warningLabel.setText("Complaint Added Successfully");
            this.warningLabel.setText("Fill up the form properly");
            this.warningLabel.setStyle("-fx-border-color: Green");

        }
        CIDTextfield.clear();
        PrtypeTextfield.clear();
        PrStatusTextfield.clear();
    }
}
