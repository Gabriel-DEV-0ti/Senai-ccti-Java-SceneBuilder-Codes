module Ex_6_5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens Ex_6_5 to javafx.fxml;
    exports Ex_6_5;
}