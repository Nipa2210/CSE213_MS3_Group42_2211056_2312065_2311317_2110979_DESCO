module com.example.group42_desco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group42_desco to javafx.fxml;
    opens com.example.group42_desco.Sakira to javafx.fxml;
    exports com.example.group42_desco;
    exports com.example.group42_desco.Nipa2211056;
    opens com.example.group42_desco.Nipa2211056 to javafx.fxml;
}