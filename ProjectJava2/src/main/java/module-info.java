module com.example.projectjava2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projectjava2 to javafx.fxml;
    exports com.example.projectjava2;
}