package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

public class FazerRegistrosController {

    @FXML
    private Hyperlink ajuda;

    @FXML
    private Button btnEnviar;

    @FXML
    private ComboBox<?> diaEntrega;

    @FXML
    private ComboBox<?> equipamento;

    @FXML
    private Hyperlink fazerRegistro;

    @FXML
    private ComboBox<?> horarioEntrega;

    @FXML
    private ImageView iconConfig;

    @FXML
    private ComboBox<?> nomeProfessor;

    @FXML
    private Hyperlink verRegistros;
    
    @FXML
    void mudarTela(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        funcoes.mudarTela2(event, fazerRegistro, "../view/menuInicial.fxml", "Ajuda");
    }
    
}