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
        Parent root = FXMLLoader.load(getClass().getResource("view/PrimeiraTela.fxml"));
        Scene cena = new Scene(root);
        
        tela.setScene(cena);
        tela.setTitle("Primeira janela");
        tela.show();
    }
}