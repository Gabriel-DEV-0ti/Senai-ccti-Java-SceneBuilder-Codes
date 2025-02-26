package Ex_3_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller {
    @FXML
    private TextField senhaInput;
    @FXML
    private Label resultadoLabel;
    @FXML
    private Button verificarButton;

    private static final String SENHA_ESPERADA = "1234";
    private static final String SENHA_ERRADA = "Senha errada, digite novamente!";
    private static final String SENHA_CORRETA = "A senha foi digitada corretamente!";

    @FXML
    protected void verificarSenha(){
        String senhaDigitada = senhaInput.getText();
        String resultado = verificar(senhaDigitada);
        resultadoLabel.setText(resultado);
    }

    private String verificar(String senhaDigitada){
        if (senhaDigitada.equals(SENHA_ESPERADA)){
            return SENHA_CORRETA;
        }else {
            return SENHA_ERRADA;
        }
    }
}
