package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import control.EmprestimoC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.*;

public class VerEmprestimosController {

    EmprestimoC emprestimoC = EmprestimoC.getInstancia();
    Funcoes funcoes = Funcoes.getInstancia();

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
        funcoes.mudarTela(event, "fazerEmprestimo.fxml", "Fazer empréstimo");
        final Stage stage = (Stage) inicio.getScene().getWindow();
        stage.close();
    }

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
        final Stage stage = (Stage) inicio.getScene().getWindow();
        stage.close();
    }

    @FXML
    void removerEmprestimo(ActionEvent event) {
        try {
            emprestimoC.lista.remove(tabela.getSelectionModel().getSelectedIndex());
            emprestimos.remove(tabela.getSelectionModel().getSelectedIndex());            
            tabela.refresh();

            ObjectOutput out = null;
            out = new ObjectOutputStream(new FileOutputStream("emprestimoC.ser"));
            out.writeObject(emprestimoC);
            out.close();
        } catch (Exception e) {
            funcoes.alertaErro("Selecione algum empréstimo para remover");
        }
    }

    @FXML
    public void initialize() throws IOException, FileNotFoundException, ClassNotFoundException {
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("emprestimoC.ser"));
            emprestimoC = (EmprestimoC) in.readObject();
            in.close();
        } catch (IOException e) {
            System.out.println("Nenhum arquivo de empréstimos encontrado");
        }

        TableColumn<Emprestimo, String> professor = new TableColumn<Emprestimo, String>("Professor");
        TableColumn<Emprestimo, String> equipamento = new TableColumn<Emprestimo, String>("Equipamento");
        TableColumn<Emprestimo, String> horarioEntrega = new TableColumn<Emprestimo, String>("Horário de uso");
        TableColumn<Emprestimo, String> diaDoUso = new TableColumn<Emprestimo, String>("Dia");

        professor.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("professor"));
        equipamento.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("equipamento"));
        horarioEntrega.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("horarioEntrega"));
        diaDoUso.setCellValueFactory(new PropertyValueFactory<Emprestimo, String>("diaDoUso"));
        
        criarEmprestimos();
        tabela.setItems(emprestimos);
        tabela.getColumns().add(professor);
        tabela.getColumns().add(equipamento);
        tabela.getColumns().add(horarioEntrega);
        tabela.getColumns().add(diaDoUso);
    }

    private ObservableList<Emprestimo> emprestimos = FXCollections.<Emprestimo>observableArrayList();

    void criarEmprestimos() {
        for(int i = 0; i < emprestimoC.lista.size(); i++) {
            emprestimos.add(new Emprestimo(
                    emprestimoC.lista.get(i).getProfessor(),
                    emprestimoC.lista.get(i).getEquipamento(),
                    emprestimoC.lista.get(i).getHorarioEntrega(),
                    emprestimoC.lista.get(i).getDiaDoUso()
                )
            );
        }
    }

}