module Ex_2_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens Ex_2_1 to javafx.fxml;
    exports Ex_2_1;
}



