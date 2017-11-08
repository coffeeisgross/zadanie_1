package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textfield1;
    public TextField textfield2;
    public Button button;
    public Label label;

    public void handleClick(ActionEvent actionEvent) {
        String tekst = null;
        tekst = textfield1.getText() + " " + textfield2.getText();
        label.setText(tekst);
    }
}
