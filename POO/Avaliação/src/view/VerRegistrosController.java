package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

public class VerRegistrosController {

    @FXML
    private Hyperlink fazerRegistro;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink inicio;

    @FXML
    private Hyperlink verAjuda;

    @FXML
    void abrirFazerRegistro(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, fazerRegistro, "../view/fazerRegistros.fxml", "Fazer registros");
    }

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, inicio, "../view/menuInicial.fxml", "Menu Inicial");
    }

    @FXML
    void abrirVerAjuda(ActionEvent event) throws IOException {

    }

}
