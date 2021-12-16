module com.example.pr9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr9 to javafx.fxml;
    exports com.example.pr9;
}