package com.example.group42_desco.Nabiha;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class AddingEmployeeViewController
{
    @FXML
    private DatePicker DOBDatePIcker;

    @FXML
    private TableColumn<HRMAddingEmployee, LocalDate> DOBTableColumn;

    @FXML
    private TableColumn<HRMAddingEmployee,String> DesignationTableColumn;

    @FXML
    private TextField DesignationTextfield;

    @FXML
    private TableColumn<HRMAddingEmployee, Integer> EmployeeIDTableColumn;

    @FXML
    private TextField EmployeeIDTextfield;

    @FXML
    private TableView<HRMAddingEmployee> EmployeeListTableView;

    @FXML
    private TableColumn<HRMAddingEmployee, String> EmployeeNameTableColumn;

    @FXML
    private TextField EmployeeNameTextfield;

    @FXML
    private DatePicker JoingDateDatePIcker;

    @FXML
    private TableColumn<HRMAddingEmployee, LocalDate> JoiningDateTableColumn;






   // ArrayList<HRMAddingEmployee> employeeList =new ArrayList<>();
    private ObservableList<HRMAddingEmployee> employeeList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        EmployeeNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        EmployeeIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));

        DesignationTableColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));
        JoiningDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));
        DOBTableColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));
        EmployeeListTableView.setItems(employeeList);
    }



    @FXML
    void AddToListOnAction(ActionEvent event) {
        if ( EmployeeNameTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide a name");
            erroralert.show();
            return;
        }
        if (EmployeeIDTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide ID");
            erroralert.show();
            return;
        }

        if (DesignationTextfield.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Designation");
            erroralert.show();
            return;
        }
        int id;
        try{
            id= Integer.parseInt(EmployeeIDTextfield.getText());
        } catch (NumberFormatException e) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("ID");
            erroralert.show();
            return;
        }


        HRMAddingEmployee s=new HRMAddingEmployee(

                DesignationTextfield.getText(),
                DOBDatePIcker.getValue(),
                id,
                EmployeeNameTextfield.getText(),
                JoingDateDatePIcker.getValue()
        );


        employeeList.add(s);
        EmployeeListTableView.getItems().addAll(s);



        EmployeeNameTextfield.clear();
        EmployeeIDTextfield.clear();
        DesignationTextfield.clear();

    }}