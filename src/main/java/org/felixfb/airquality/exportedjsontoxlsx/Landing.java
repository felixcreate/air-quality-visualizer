package org.felixfb.airquality.exportedjsontoxlsx;

import javafx.fxml.FXML;
import javafx.scene.Node;
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
        importType.focusedProperty().addListener(new removeFocused());
        importFile.focusedProperty().addListener(new removeFocused());
    }
    @FXML
    private ChoiceBox<ImportType> importType;

    @FXML
    private TextField importFile;

    public void onFileSelect(MouseEvent e) {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Choose import file");
        File file = chooser.showOpenDialog(stage);
        if(file != null) {
            importFile.setText(file.getPath());
            importFile.positionCaret(file.getPath().length());
        }
    }
}
