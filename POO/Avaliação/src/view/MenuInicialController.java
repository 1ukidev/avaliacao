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
    void abrirFazerRegistro(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        fazerRegistro.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerRegistros.fxml", "Fazer registros");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        verRegistros.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }
    
    @FXML
    void abrirVerAjuda(ActionEvent event) throws IOException {
       Funcoes funcoes = new Funcoes();
        ajuda.getScene().getWindow().hide();
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
    }
}
