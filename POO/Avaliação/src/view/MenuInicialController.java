package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

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
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer empréstimo");
        final Stage stage = (Stage) fazerEmprestimo.getScene().getWindow();
        stage.close();
    }

    @FXML
    void abrirVerEmprestimos(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver empréstimos");
        final Stage stage = (Stage) verEmprestimos.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
        final Stage stage = (Stage) tutorial.getScene().getWindow();
        stage.close();
    }
    
}
