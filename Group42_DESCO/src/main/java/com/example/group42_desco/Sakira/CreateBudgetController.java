package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.group42_desco.Sakira.CreateBudget.BudgetList;

public class CreateBudgetController
{
    @javafx.fxml.FXML
    private TableView<CreateBudget> CreateBudgetTV;
    @javafx.fxml.FXML
    private TableColumn<CreateBudget , String> TotalBudgetTC;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private TableColumn<CreateBudget, String> DepartmentTC;
    @javafx.fxml.FXML
    private ComboBox<Integer> FiscalYearCB;
    @javafx.fxml.FXML
    private TableColumn<CreateBudget , Integer> FiscalYearTC;
    @javafx.fxml.FXML
    private TextField TotalBudgetTF;

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentCB.getItems().addAll("Administration", "Engineering", "Finance and Accounts", "Procurement", "Operations");
        FiscalYearCB.getItems().addAll(2024, 2025 , 2025 , 2026, 2027);

        FiscalYearTC.setCellValueFactory(new PropertyValueFactory<CreateBudget,Integer>("FiscalYear"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<CreateBudget , String>("Department"));
        TotalBudgetTC.setCellValueFactory(new PropertyValueFactory<CreateBudget , String>("TotalBudget"));
    }

    @javafx.fxml.FXML
    public void ShowTotalBudgetSummaryOA(ActionEvent actionEvent) {
        if (TotalBudgetTF.getText().isEmpty() || FiscalYearCB.getValue() == null || DepartmentCB.getValue() == null) {
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText(null); // No header
            errorAlert.setContentText("Please ensure all fields are filled out correctly.");
            errorAlert.showAndWait();
            return; // Stop execution if any field is empty
        }

        // 2. Create the new budget object
        CreateBudget b = new CreateBudget(
                FiscalYearCB.getValue(),
                DepartmentCB.getValue(),
                Integer.parseInt(TotalBudgetTF.getText())
        );

        // 3. Add the new object to the list and refresh the table
        BudgetList.add(b);
        CreateBudgetTV.getItems().add(b);
        CreateBudgetTV.refresh(); // Refresh the table to show the new data




    }



    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/AccountantDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Accountant Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}