package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

public class MenuInicialController {

    Funcoes funcoes = Funcoes.getInstancia();

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
        fazerEmprestimo.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer emprestimo");
    }

    @FXML
    void abrirVerEmprestimos(ActionEvent event) throws IOException {
        verEmprestimos.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver emprestimos");
    }
    
    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        tutorial.getScene().getWindow().hide();
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
    }
    
}
