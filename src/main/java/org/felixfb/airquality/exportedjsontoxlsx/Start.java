package org.felixfb.airquality.exportedjsontoxlsx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Start extends Application {
    public static Node root;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent parent = loader.load(Start.class.getResourceAsStream("landing.fxml"));
        Start.root = parent;
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Package Air Quality Data");
        stage.getIcons().add(new Image(Objects.requireNonNull(Start.class.getResourceAsStream("icon16.png"))));
        stage.getIcons().add(new Image(Objects.requireNonNull(Start.class.getResourceAsStream("icon32.png"))));
        stage.getIcons().add(new Image(Objects.requireNonNull(Start.class.getResourceAsStream("icon64.png"))));
        stage.show();
        parent.requestFocus();
    }
}
