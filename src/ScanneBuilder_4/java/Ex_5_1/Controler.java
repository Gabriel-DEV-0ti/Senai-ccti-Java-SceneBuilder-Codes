package Ex_5_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controler{
    @FXML
    private Label resultadoLabel;
    @FXML
    private TextField idadeInput;
    @FXML
    private Button verificarButton;

    @FXML
    public void verificarIdade(){
        try {
            int idade = Integer.parseInt(idadeInput.getText());
            String faixaEtaria = varificarFaixaEtaria(idade);
            resultadoLabel.setText(faixaEtaria);
        }catch (NumberFormatException e){
            resultadoLabel.setText("Por favor, insira uma idade valida");
        }
    }

    private String varificarFaixaEtaria(int idade){
        if (idade <= 12){
            return "Você é uma criança";
        } else if (idade >= 13 && idade <= 18) {
            return "Você é um adolecente";
        } else if (idade >= 19 && idade <= 59) {
            return "Você é um adulto";
        }else {
            return "Você é um idoso";
        }
    }

}
