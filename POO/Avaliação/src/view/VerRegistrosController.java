package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import control.*;

public class VerRegistrosController implements Initializable {
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
        
        professor.setCellValueFactory(cellData -> {
            Integer i = cellData.getValue();
            return new ReadOnlyStringWrapper(emprestimoC.lista.get(i).getProfessor());
        });
        diaDoUso.setCellValueFactory(cellData -> {
            Integer i = cellData.getValue();
            return new ReadOnlyStringWrapper(emprestimoC.lista.get(i).getProfessor());
        });
        equipamento.setCellValueFactory(cellData -> {
            Integer i = cellData.getValue();
            return new ReadOnlyStringWrapper(emprestimoC.lista.get(i).getProfessor());
        });
        horarioEntrega.setCellValueFactory(cellData -> {
            Integer i = cellData.getValue();
            return new ReadOnlyStringWrapper(emprestimoC.lista.get(i).getProfessor());
        });

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        adicionarRegistros();
    }
}
