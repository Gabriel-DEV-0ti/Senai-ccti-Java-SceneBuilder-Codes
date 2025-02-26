module Ex_5_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens Ex_5_1 to javafx.fxml;
    exports Ex_5_1;
}