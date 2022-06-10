package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import model.Emprestimo; 

public class FazerRegistrosController {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Button btnEnviar;

    @FXML
    private DatePicker diaEntrega;

    @FXML
    private TextField equipamento;

    @FXML
    private Hyperlink fazerRegistro;

    @FXML
    private TextField horarioEntrega;

    @FXML
    private ImageView iconConfig;

    @FXML
    private ChoiceBox<?> nomeProfessor;

    @FXML
    private Hyperlink verRegistros;

    @FXML
    void abrirTelaInicio(ActionEvent event) {
        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) {
        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }

    @FXML
    void enviar(ActionEvent event) {

    }

}
