module com.example.supplychainmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.supplychainmanagement to javafx.fxml;
    exports com.example.supplychainmanagement;
}