package com.example.group42_desco.Nipa2211056;

import com.example.group42_desco.HelloApplication;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProfileView {

    @FXML
    private TextField Addresstextfield;

    @FXML
    private ComboBox<String> ConnectionTypeCombobox;

    @FXML
    private TextField MNtextfield;

    @FXML
    private TextField Nametextfield;

    @FXML
    void BackOnaction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nipa/CustomerDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Payment History");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    //ObservableList<CustomerProfile> CprofileList = FXCollections.observableArrayList();
    ArrayList<CustomerProfile> customerList;

    @FXML
    public void initialize(){
        customerList = new ArrayList<CustomerProfile>();
        ConnectionTypeCombobox.getItems().addAll("Residential","Commercial");
//        CprofileList.add(new CustomerProfile("Nipa", "Narayangonj", "12345", ""));
//        ConnectionTypeCombobox.getItems().addAll("Residential","Commercial");
//        CprofileList.add((CustomerProfile) CprofileList);
    }

    @FXML
    void CancelOnaction(ActionEvent event) {

    }

    @FXML
    void EditOnaction(ActionEvent event) {

    }

    @FXML
    public void SavebinOnaction(ActionEvent actionEvent) {
    }

    @FXML
    public void SavetxtOnaction(ActionEvent actionEvent) {

        try{
            File f = new File("CustomerInfo.txt");
            FileWriter fw = null;
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str="";
            for(CustomerProfile c: customerList){
                str+= c.toString("For file writing");
            }
            fw.write(str);
            fw.close();
        }
        catch(IOException e){
            //
        }
//        customerList.add(new CustomerProfile(Nametextfield.getText(),
//                Addresstextfield.getText(),
//                ConnectionTypeCombobox.getValue(),
//                MNtextfield.getText()));

//        Nametextfield.clear();
//        ConnectionTypeCombobox.clea;
    }
}
