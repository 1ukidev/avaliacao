package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import control.*;

public class VerRegistrosController {

    EmprestimoC emprestimoC = new EmprestimoC();

    @FXML
    private Hyperlink fazerRegistro;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink inicio;

    @FXML
    private TableView<Integer> tabela;

    void adicionarRegistros() {
        TableColumn<Integer, String> professor = new TableColumn<Integer, String>("Professor");
        TableColumn<Integer, String> diaDoUso = new TableColumn<Integer, String>("Dia do uso");
        TableColumn<Integer, String> equipamento = new TableColumn<Integer, String>("Equipamento");
        TableColumn<Integer, String> horarioEntrega = new TableColumn<Integer, String>("Horário de entrega");

        tabela.getColumns().add(professor);
        tabela.getColumns().add(diaDoUso);
        tabela.getColumns().add(equipamento);
        tabela.getColumns().add(horarioEntrega);
    }

    @FXML
    void abrirFazerRegistro(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        inicio.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerRegistros.fxml", "Fazer registros");
        
    }

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        inicio.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    public void initialize() {
        adicionarRegistros();
        System.out.println(emprestimoC.lista.get(0).getProfessor());
    }

}
