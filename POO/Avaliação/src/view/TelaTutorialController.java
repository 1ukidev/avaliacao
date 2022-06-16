package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;

public class TelaTutorialController {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Hyperlink verRegistros;

    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    void abrirTelaInicio(MouseEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("telainicio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Home - Inicio");
        stage.show();

    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("VerRegistros.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Registros");
        stage.show();


    }

}
