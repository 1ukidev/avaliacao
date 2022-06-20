package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class TelaTutorialController {

    Funcoes funcoes = Funcoes.getInstancia();

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Hyperlink verEmprestimos;

    @FXML
    private Hyperlink fazerEmprestimo;

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
        final Stage stage = (Stage) verEmprestimos.getScene().getWindow();
        stage.close();
    }

    @FXML
    void abrirVerEmprestimos(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver empréstimos");
        final Stage stage = (Stage) verEmprestimos.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    void abrirFazerEmprestimo(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer empréstimo");
        final Stage stage = (Stage) verEmprestimos.getScene().getWindow();
        stage.close();
    }

}
