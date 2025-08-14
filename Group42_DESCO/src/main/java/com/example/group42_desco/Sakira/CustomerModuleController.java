package com.example.group42_desco.Sakira;

import com.example.group42_desco.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CustomerModuleController
{
    @javafx.fxml.FXML
    private TableColumn CustomerNameTC;
    @javafx.fxml.FXML
    private TableColumn CustomerIDTC;
    @javafx.fxml.FXML
    private TableView CustomerModuleTV;
    @javafx.fxml.FXML
    private TableColumn ContactDetailsTC;
    @javafx.fxml.FXML
    private TableColumn CustomerAreaTC;
    @javafx.fxml.FXML
    private TableColumn BloodGroupTC;
    @javafx.fxml.FXML
    private ComboBox BloodGroupCB;
    @javafx.fxml.FXML
    private TextField CustomerNameTF;
    @javafx.fxml.FXML
    private TextField CustomerIDTF;
    @javafx.fxml.FXML
    private TextField CustomerAreaTF;
    @javafx.fxml.FXML
    private TextField ContactDetailsTF;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void PreviousOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/ViewCustomerProfile.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("View Customer Profile");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void ViewOA(ActionEvent actionEvent) {
    }
}