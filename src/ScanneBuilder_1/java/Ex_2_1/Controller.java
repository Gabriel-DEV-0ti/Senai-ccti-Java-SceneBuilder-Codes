package Ex_2_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nota1;
    @FXML
    private TextField nota2;
    @FXML
    private Label media;
    @FXML
    protected void button(){
        int nota = Integer.parseInt(nota1.getText());
        int notinha = Integer.parseInt(nota2.getText());
        double med = (nota + notinha) / 2;
        media.setText("" + med);
    }
}
