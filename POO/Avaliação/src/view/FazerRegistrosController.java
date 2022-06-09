package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FazerRegistrosController {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Hyperlink ajuda;

    @FXML
    private Button btnEnviar;

    @FXML
    private ComboBox<?> diaEntrega;

    @FXML
    private ComboBox<?> equipamento;

    @FXML
    private ComboBox<?> horarioEntrega;

    @FXML
    private ImageView iconConfig;

    @FXML
    private AnchorPane labelText;

    @FXML
    private ComboBox<?> nomeProfessor;

    @FXML
    private Hyperlink verRegistros;

    @FXML
    void abrirTelaAjuda(ActionEvent event) throws IOException {
        
    }

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, Inicio, "../view/menuInicial.fxml", "Menu Inicial");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, verRegistros, "../view/verRegistros.fxml", "Ver Registros");
    }

}
