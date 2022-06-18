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

public class VerRegistrosController {

    @FXML
    private Hyperlink fazerRegistros;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink inicio;

    @FXML
    private TableView<Registro> tabela;

    @FXML
    private Button btnRemover;

    @FXML
    void abrirFazerRegistros(ActionEvent event) throws IOException {
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
    void removerRegistro(ActionEvent event) {
        try {
            EmprestimoC.getInstancia().lista.remove(tabela.getSelectionModel().getSelectedIndex());
            registros.remove(tabela.getSelectionModel().getSelectedIndex());
            tabela.refresh();
        } catch (Exception e) {
            alertaErro("Selecione algum registro para remover");
        }
    }

    @FXML
    public void initialize() {
        TableColumn<Registro, String> professor = new TableColumn<Registro, String>("Professor");
        TableColumn<Registro, String> equipamento = new TableColumn<Registro, String>("Equipamento");
        TableColumn<Registro, String> horarioEntrega = new TableColumn<Registro, String>("Horário de uso");
        TableColumn<Registro, String> diaDoUso = new TableColumn<Registro, String>("Dia");

        professor.setCellValueFactory(new PropertyValueFactory<Registro, String>("professor"));
        equipamento.setCellValueFactory(new PropertyValueFactory<Registro, String>("equipamento"));
        horarioEntrega.setCellValueFactory(new PropertyValueFactory<Registro, String>("horarioEntrega"));
        diaDoUso.setCellValueFactory(new PropertyValueFactory<Registro, String>("diaDoUso"));
        
        criarRegistros();
        tabela.setItems(registros);
        tabela.getColumns().addAll(professor, equipamento, horarioEntrega, diaDoUso);
    }

    private ObservableList<Registro> registros = FXCollections.<Registro>observableArrayList();

    void criarRegistros() {
        for(int i = 0; i < EmprestimoC.getInstancia().lista.size(); i++) {
            registros.add(new Registro(
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