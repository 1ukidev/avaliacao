package view;

import java.io.IOException;

import control.EmprestimoC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import model.*;

public class VerEmprestimosController {

    @FXML
    private Hyperlink fazerEmprestimo;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink inicio;

    @FXML
    private TableView<Emprestimo> tabela;

    @FXML
    private Button btnRemover;

    @FXML
    void abrirFazerEmprestimo(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        inicio.getScene().getWindow().hide();
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer emprestimo");
    }

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        inicio.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    void removerEmprestimo(ActionEvent event) {
        try {
            EmprestimoC.getInstancia().lista.remove(tabela.getSelectionModel().getSelectedIndex());
            emprestimos.remove(tabela.getSelectionModel().getSelectedIndex());
            tabela.refresh();
        } catch (Exception e) {
            alertaErro("Selecione algum registro para remover");
        }
    }

    @FXML
    public void initialize() {
        TableColumn<Emprestimo, String> professor = new TableColumn<Emprestimo, String>("Professor");
        TableColumn<Emprestimo, String> equipamento = new TableColumn<Emprestimo, String>("Equipamento");
        TableColumn<Emprestimo, String> horarioEntrega = new TableColumn<Emprestimo, String>("Horário de uso");
        TableColumn<Emprestimo, String> diaDoUso = new TableColumn<Emprestimo, String>("Dia");

        professor.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("professor"));
        equipamento.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("equipamento"));
        horarioEntrega.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("horarioEntrega"));
        diaDoUso.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("diaDoUso"));
        
        criarRegistros();
        tabela.setItems(emprestimos);
        tabela.getColumns().add(professor);
        tabela.getColumns().add(equipamento);
        tabela.getColumns().add(horarioEntrega);
        tabela.getColumns().add(diaDoUso);
    }

    private ObservableList<Emprestimo> emprestimos = FXCollections.<Emprestimo>observableArrayList();

    void criarRegistros() {
        for(int i = 0; i < EmprestimoC.getInstancia().lista.size(); i++) {
            emprestimos.add(new Emprestimo(
                    EmprestimoC.getInstancia().lista.get(i).getProfessor(),
                    EmprestimoC.getInstancia().lista.get(i).getEquipamento(),
                    EmprestimoC.getInstancia().lista.get(i).getHorarioEntrega(),
                    EmprestimoC.getInstancia().lista.get(i).getDiaDoUso()
                )
            );
        }
    }

    void alertaErro(String texto) {
        Alert mensagem = new Alert(AlertType.ERROR);
        mensagem.setContentText(texto);
        mensagem.show();
    }

}