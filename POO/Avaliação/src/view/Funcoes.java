package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle(nomeDaJanela);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void alertaErro(String texto) {
        Alert mensagem = new Alert(AlertType.ERROR);
        mensagem.setContentText(texto);
        mensagem.show();
    }
}