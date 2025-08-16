package com.example.group42_desco.Nabiha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddingPolicyViewController {

    @javafx.fxml.FXML
    private TextArea PolicyWrittingTextField;

    @javafx.fxml.FXML
    private TableView<HRManagerPolicy> PolicyTableView;

    @javafx.fxml.FXML
    private TableColumn<HRManagerPolicy, String> policyTableColumn;

    private ObservableList<HRManagerPolicy> policyList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        policyTableColumn.setCellValueFactory(new PropertyValueFactory<>("policy"));
        PolicyTableView.setItems(policyList);
    }


    @javafx.fxml.FXML
    public void postButtonOnAction(ActionEvent actionEvent) {

        if (PolicyWrittingTextField.getText().isEmpty()) {
            Alert erroralert = new Alert(Alert.AlertType.INFORMATION);
            erroralert.setContentText("Add policy");
            erroralert.show();
            return; // Exit the method if the TextArea is empty
        }


        HRManagerPolicy s = new HRManagerPolicy(PolicyWrittingTextField.getText());


        policyList.add(s);


        PolicyWrittingTextField.clear();
    }
}
