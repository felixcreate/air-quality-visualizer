module org.felixfb.airquality.exportedjsontoxlsx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.felixfb.airquality.exportedjsontoxlsx to javafx.fxml;
    exports org.felixfb.airquality.exportedjsontoxlsx;
}