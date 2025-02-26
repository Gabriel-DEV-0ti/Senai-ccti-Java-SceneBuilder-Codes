package Ex_6_5;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controler {
    @FXML
    private TextField nomeInput;
    @FXML
    private TextField valorCompraInput;
    @FXML
    private Label resultadoLabel;
    @FXML
    private Button verificarButton;

    // Método que será chamado ao clicar no botão "Verificar"
    @FXML
    public void verificarBrinde() {
        try {
            String nome = nomeInput.getText();
            double valorCompra = Double.parseDouble(valorCompraInput.getText());

            double valorMinimo = 100.0;

            String resultado = valorCompra >= valorMinimo
                    ? nome + ", parabéns, você ganhou o BRINDE!!"
                    : nome + ", infelizmente não foi dessa vez";

            resultadoLabel.setText(resultado);

        } catch (NumberFormatException e) {
            resultadoLabel.setText("Por favor, insira valores válidos.");
        }
    }
}
