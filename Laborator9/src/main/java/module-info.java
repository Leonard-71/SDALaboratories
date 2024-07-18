module com.example.labb9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labb9 to javafx.fxml;
    exports com.example.labb9;
}