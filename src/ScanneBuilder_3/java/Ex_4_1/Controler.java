package Ex_4_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controler {
    @FXML
    private TextField num1Imput;
    @FXML
    private TextField num2Imput;
    @FXML
    private Label resultadoLabel;
    @FXML
    private Button verificarButton;

    @FXML
    protected void verificarSoma() {
        try {
            int num1 = Integer.parseInt(num1Imput.getText());
            int num2 = Integer.parseInt(num2Imput.getText());

            int resultado = soma(num1, num2);
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Por favor, insira números válidos.");
        }
    }

    private int soma(int num1, int num2) {
        int somaNum = num1 + num2;

        if (somaNum > 100) {
            return somaNum;
        } else {
            return somaNum;
        }
    }
}
