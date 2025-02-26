package Ex_6_5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Program extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Carrega o arquivo FXML e configura a cena
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Verificação de Brinde");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
