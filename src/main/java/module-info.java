module com.example.programmingexercise_14_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.programmingexercise_14_1 to javafx.fxml;
    exports com.example.programmingexercise_14_1;
}