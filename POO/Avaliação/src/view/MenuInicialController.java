package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

public class MenuInicialController {

    @FXML
    private Hyperlink tutorial;

    @FXML
    public Hyperlink fazerRegistros;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink verRegistros;

    @FXML
    void abrirFazerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        fazerRegistros.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerRegistros.fxml", "Fazer registros");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        verRegistros.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }
    
    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        tutorial.getScene().getWindow().hide();
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
    }
    
}
