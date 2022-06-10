package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class telaInicio {

    @FXML
    private Button btnNao;

    @FXML
    private Button btnSim;

    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        btnSim.getScene().getWindow().hide();
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
    }

    @FXML
    void pularTutorial(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        btnNao.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

}
