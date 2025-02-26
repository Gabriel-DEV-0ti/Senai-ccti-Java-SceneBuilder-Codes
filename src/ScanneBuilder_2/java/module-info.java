module Ex_3_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens Ex_3_2 to javafx.fxml;
    exports Ex_3_2;
}