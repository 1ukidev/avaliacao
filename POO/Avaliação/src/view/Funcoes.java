package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Funcoes {
    public void mudarTela(ActionEvent event, String path, String nomeDaJanela) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        Parent root = (Parent) fxmlLoader.load();
        Image icon = new Image("imagens/icon.png");
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle(nomeDaJanela);
        stage.setScene(new Scene(root));
        stage.getIcons().add(icon);
        stage.show();
    }

   
}
