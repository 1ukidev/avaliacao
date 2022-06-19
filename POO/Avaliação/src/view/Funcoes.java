package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Funcoes {
    private static Funcoes instancia = null;

    public static Funcoes getInstancia() {
        if (instancia == null) {
            instancia = new Funcoes();
        }
        return instancia;
    }

    public void mudarTela(ActionEvent event, String path, String nomeDaJanela) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(path));
        Stage tela = new Stage();
        Image icon = new Image("view/imagens/icon_1.png");
        
        tela.setResizable(false);
        tela.setScene(new Scene(root));
        tela.setTitle(nomeDaJanela);
        tela.getIcons().add(icon);
        tela.show();
    }

    public void alertaErro(String texto) {
        Alert mensagem = new Alert(AlertType.ERROR);
        mensagem.setContentText(texto);
        mensagem.show();
    }
}