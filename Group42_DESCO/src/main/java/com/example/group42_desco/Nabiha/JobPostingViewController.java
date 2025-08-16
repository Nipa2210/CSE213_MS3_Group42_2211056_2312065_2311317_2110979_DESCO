package com.example.group42_desco.Nabiha;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class JobPostingViewController
{
    @javafx.fxml.FXML
    private TextArea DescripAndRequirementTextArea;
    @javafx.fxml.FXML
    private DatePicker StartingDateOfApplicationDatepicker;
    @javafx.fxml.FXML
    private TextField DesignationTextField;
    @javafx.fxml.FXML
    private DatePicker LastDateOfApplicationDatepicker;
    @javafx.fxml.FXML
    private Button JobPostButton;
    @javafx.fxml.FXML
    private TextField EduQualificationTextField;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void JobPostButtonOnAction(ActionEvent actionEvent) {
    }
}