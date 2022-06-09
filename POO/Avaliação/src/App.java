import java.io.IOException;

import javafx.application.Application;  
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage tela) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view/telaInicio.fxml"));
        Scene cena = new Scene(root);
        
        tela.setResizable(false);
        tela.setScene(cena);
        tela.setTitle("Introdução");
        tela.show();
    }
}