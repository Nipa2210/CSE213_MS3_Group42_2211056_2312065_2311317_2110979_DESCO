package com.example.group42_desco.Nabiha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class AddingEmployeeViewController {

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
    private TableView<String> EmployeeListTableView;

    @FXML
    private TableColumn<HRMAddingEmployee, Stringtring> EmployeeNameTableColumn;

    @FXML
    private TextField EmployeeNameTextfield;

    @FXML
    private DatePicker JoingDateDatePIcker;

    @FXML
    private TableColumn<HRMAddingEmployee, LocalDate> JoiningDateTableColumn;






    @javafx.fxml.FXML
    public void initialize() {
    }


    @FXML
    void AddToListOnAction(ActionEvent event) {

    }}