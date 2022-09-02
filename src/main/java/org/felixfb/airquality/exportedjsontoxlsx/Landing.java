package org.felixfb.airquality.exportedjsontoxlsx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Landing {
    @FXML
    public void initialize() {
        for(ImportType type : ImportType.values()) {
            importType.getItems().add(type);
        }
        importType.setValue(ImportType.getDefaultType());
        importType.focusedProperty().addListener(new RemoveFocused());
        importFile.focusedProperty().addListener(new RemoveFocused());
        next.focusedProperty().addListener(new RemoveFocused());
    }
    @FXML
    private ChoiceBox<ImportType> importType;

    @FXML
    private TextField importFile;
    private File importFileToUse;

    @FXML
    private Button next;

    public void onFileSelect(MouseEvent e) {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Choose import file");
        File file = chooser.showOpenDialog(stage);
        if(file != null) {
            importFile.setText(file.getPath());
            importFileToUse = file;
            importFile.positionCaret(file.getPath().length());
            next.setDisable(false);
        }
    }

    public void onNext(ActionEvent ignoredE) {
        System.out.println(importType.getValue());
        System.out.println(importFileToUse);
        Platform.exit();
    }
}
