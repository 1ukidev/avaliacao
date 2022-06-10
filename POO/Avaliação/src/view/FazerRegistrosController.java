package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FazerRegistrosController {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private AnchorPane abrirFazerRegistro;

    @FXML
    private Button btnEnviar;

    @FXML
    private DatePicker diaEntrega;

    @FXML
    private ChoiceBox<?> equipamento;

    @FXML
    private ComboBox<?> horarioEntrega;

    @FXML
    private ImageView iconConfig;

    @FXML
    private ComboBox<?> nomeDoProfessor;

    @FXML
    private Hyperlink verRegistros;

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }

    @FXML
    void enviar(ActionEvent event) {
        
    }
    

}
