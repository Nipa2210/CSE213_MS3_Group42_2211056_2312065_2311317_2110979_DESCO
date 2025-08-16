package com.example.group42_desco.Nabiha;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;

public class AddingPayrollOfaDesignationViewController {
    @javafx.fxml.FXML
    private TableColumn<HRManagerAddingPayroll, Integer> SalaryTableColumn;
    @javafx.fxml.FXML
    private TextField SalaryTextField;
    @javafx.fxml.FXML
    private TableColumn<HRManagerAddingPayroll, String> DesignationTableColumn;
    @javafx.fxml.FXML
    private TextField designationTextField;
    @javafx.fxml.FXML
    private TableView<HRManagerAddingPayroll> PayrollsTableView;

    private ObservableList<HRManagerAddingPayroll> payrollList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        DesignationTableColumn.setCellValueFactory(new PropertyValueFactory<>("Designation"));
        SalaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("Salary"));
        PayrollsTableView.setItems(payrollList); // Fixed closing bracket
    }

    @javafx.fxml.FXML
    public void AddtoListOnAction(ActionEvent actionEvent) {
        if (designationTextField.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("designation");
            erroralert.show();
            return;
        }
        if (SalaryTextField.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("salary");
            erroralert.show();
            return;
        }

        int salary;
        try {
            salary = Integer.parseInt(SalaryTextField.getText());
        } catch (NumberFormatException e) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("salary");
            erroralert.show();
            return;
        }

        // Fixed the constructor and added closing parenthesis
        HRManagerAddingPayroll s = new HRManagerAddingPayroll(
                salary,
                designationTextField.getText()

        );

        payrollList.add(s);
        PayrollsTableView.getItems().add(s);

        designationTextField.clear();
        SalaryTextField.clear();
    }
}
