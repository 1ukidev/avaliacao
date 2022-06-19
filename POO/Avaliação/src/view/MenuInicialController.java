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
    public Hyperlink fazerEmprestimo;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink verEmprestimos;

    @FXML
    void abrirFazerEmprestimo(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        fazerEmprestimo.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer emprestimo");
    }

    @FXML
    void abrirVerEmprestimos(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        verEmprestimos.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver emprestimos");
    }
    
    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        tutorial.getScene().getWindow().hide();
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
    }
    
}
