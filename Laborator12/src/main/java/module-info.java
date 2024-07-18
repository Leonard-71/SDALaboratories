module com.example.lab12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorul12 to javafx.fxml;
    exports com.example.laboratorul12;
}