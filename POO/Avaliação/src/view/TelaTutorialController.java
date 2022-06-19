package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

public class TelaTutorialController {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Hyperlink verEmprestimos;

    @FXML
    private Hyperlink fazerEmprestimo;

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        Inicio.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    void abrirVerEmprestimos(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        verEmprestimos.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver emprestimos");
    }
    
    @FXML
    void abrirFazerEmprestimo(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        verEmprestimos.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer emprestimo");
    }

}
