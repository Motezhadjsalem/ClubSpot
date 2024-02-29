module com.example.karoufx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.karoufx to javafx.fxml;
    exports com.example.karoufx;
}