package org.felixfb.airquality.exportedjsontoxlsx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class removeFocused implements ChangeListener<Boolean> {
    @Override
    public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldProperty, Boolean newProperty) {
        if(newProperty.equals(true)) {
            Start.root.requestFocus();
        }
    }
}
