package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaInicioController {

    Funcoes funcoes = Funcoes.getInstancia();

    @FXML
    private Button btnNao;

    @FXML
    private Button btnSim;

    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
        final Stage stage = (Stage) btnSim.getScene().getWindow();
        stage.close();
    }

    @FXML
    void pularTutorial(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
        final Stage stage = (Stage) btnNao.getScene().getWindow();
        stage.close();
    }

}
