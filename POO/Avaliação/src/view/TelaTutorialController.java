package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

public class TelaTutorialController {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Hyperlink verRegistros;

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        Inicio.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        verRegistros.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }
}
