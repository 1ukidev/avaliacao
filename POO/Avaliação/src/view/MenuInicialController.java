package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

public class MenuInicialController {

    @FXML
    private Hyperlink ajuda;

    @FXML
    public Hyperlink fazerRegistro;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink verRegistros;

    @FXML
    void mudarTela(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, fazerRegistro, "fazerRegistros.fxml", "Fazer registros");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, verRegistros, "verRegistros.fxml", "Ver Registros");
    }
    
    @FXML
    void abrirVerAjuda(ActionEvent event) throws IOException {

    }
}
