module com.example.group42_desco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group42_desco to javafx.fxml;
    exports com.example.group42_desco;
}