module Ex_4_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens Ex_4_1 to javafx.fxml;
    exports Ex_4_1;
}