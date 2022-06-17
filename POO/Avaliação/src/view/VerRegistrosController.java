package view;

import java.io.IOException;

import control.EmprestimoC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import model.Registro;

public class VerRegistrosController {

    @FXML
    private Hyperlink fazerRegistro;

    @FXML
    private ImageView iconConfig;

    @FXML
    private Hyperlink inicio;

    @FXML
    private TableView<Registro> tabela;

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
        TableColumn<Registro, String> professor = new TableColumn<Registro, String>("Professor");
        TableColumn<Registro, String> diaDoUso = new TableColumn<Registro, String>("Dia do uso");
        TableColumn<Registro, String> equipamento = new TableColumn<Registro, String>("Equipamento");
        TableColumn<Registro, String> horarioEntrega = new TableColumn<Registro, String>("Horário de entrega");

        professor.setCellValueFactory(new PropertyValueFactory<>("professor"));
        diaDoUso.setCellValueFactory(new PropertyValueFactory<>("diaDoUso"));
        equipamento.setCellValueFactory(new PropertyValueFactory<>("equipamento"));
        horarioEntrega.setCellValueFactory(new PropertyValueFactory<>("horarioEntrega"));
        
        tabela.setItems(criarRegistros());
        tabela.getColumns().addAll(professor, diaDoUso, equipamento, horarioEntrega);
    }

    ObservableList<Registro> criarRegistros() {
        for(int i = 0; i < EmprestimoC.getInstancia().lista.size(); i++) {
            return FXCollections.observableArrayList(
                new Registro(
                    EmprestimoC.getInstancia().lista.get(i).getProfessor(),
                    EmprestimoC.getInstancia().lista.get(i).getDiaDoUso(),
                    EmprestimoC.getInstancia().lista.get(i).getEquipamento(),
                    EmprestimoC.getInstancia().lista.get(i).getHorarioEntrega()
                )
            );
        }
        return null;
    }

}