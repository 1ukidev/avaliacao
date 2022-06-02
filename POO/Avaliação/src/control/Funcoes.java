package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class Funcoes {
    public void mudarTela2(ActionEvent event, Hyperlink componente, String path, String nomeDaJanela) throws IOException {
        componente.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle(nomeDaJanela);
        stage.setScene(new Scene(root));
        stage.show();
    }
}