package com.example.group42_desco.Nabiha;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EvaluatingEmployeePerformanceViewController {

    @javafx.fxml.FXML
    private TextField DesignationTextField;
    @javafx.fxml.FXML
    private TableColumn<HRManagerEvaluatingPerformance, String> NameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HRManagerEvaluatingPerformance, String> DesignationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HRManagerEvaluatingPerformance, String> PerformanceTableColumn;
    @javafx.fxml.FXML
    private TextField EmployeeNameTextField;
    @javafx.fxml.FXML
    private TableColumn<HRManagerEvaluatingPerformance, Integer> IDTableColumn;
    @javafx.fxml.FXML
    private TableView<HRManagerEvaluatingPerformance> EmployeePerformanceTableView;
    @javafx.fxml.FXML
    private ComboBox<String> performanceComboBox;
    @javafx.fxml.FXML
    private TextField IDTextField;


    private ObservableList<HRManagerEvaluatingPerformance> performanceEvaluationList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        performanceComboBox.getItems().addAll("1 star", "2 star", "3 star", "4 star", "5 star");

        DesignationTableColumn.setCellValueFactory(new PropertyValueFactory<>("Designation"));
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        IDTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        PerformanceTableColumn.setCellValueFactory(new PropertyValueFactory<>("performanceRating"));
        EmployeePerformanceTableView.setItems(performanceEvaluationList);
    }


    @javafx.fxml.FXML
    public void SaveButtonOnAction(ActionEvent actionEvent) {

        if (performanceComboBox.getValue() == null) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Select rating");
            erroralert.show();
            return;
        }


        if (DesignationTextField.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide designation");
            erroralert.show();
            return;
        }

        if (IDTextField.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide ID");
            erroralert.show();
            return;
        }

        if (EmployeeNameTextField.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Provide name");
            erroralert.show();
            return;
        }


        int id;
        try {
            id = Integer.parseInt(IDTextField.getText());
        } catch (NumberFormatException e) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("ID should be a number");
            erroralert.show();
            return;
        }


        HRManagerEvaluatingPerformance s = new HRManagerEvaluatingPerformance(
                DesignationTextField.getText(),
                id,
                EmployeeNameTextField.getText(),
                performanceComboBox.getValue()
        );


        performanceEvaluationList.add(s);


        EmployeeNameTextField.clear();
        performanceComboBox.setValue(null);
        IDTextField.clear();
        DesignationTextField.clear();
    }
}
