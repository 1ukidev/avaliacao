package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import control.*;

public class FazerRegistrosController implements Initializable {
    EmprestimoC emprestimoC = new EmprestimoC();

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Button btnEnviar;

    @FXML
    private ComboBox<String> diaDoUso;

    @FXML
    private ComboBox<String> equipamento;

    @FXML
    private ComboBox<String> horarioEntrega;

    @FXML
    private ImageView iconConfig;

    @FXML
    private AnchorPane labelText;

    @FXML
    private ComboBox<String> nomeDoProfessor;

    @FXML
    private Hyperlink verRegistros;
    
    void adicionarProfessores() {
        nomeDoProfessor.getItems().add("Clemilton");
        nomeDoProfessor.getItems().add("Wendel");
        nomeDoProfessor.getItems().add("Mozean");
        nomeDoProfessor.getItems().add("Rossana");
        nomeDoProfessor.getItems().add("Alcides");
        nomeDoProfessor.getItems().add("Daniel");
        nomeDoProfessor.getItems().add("Gadelha");
        nomeDoProfessor.getItems().add("Neto");
        nomeDoProfessor.getItems().add("Giselly");
        nomeDoProfessor.getItems().add("Zilma");
        nomeDoProfessor.getItems().add("Rodrigo");
        nomeDoProfessor.getItems().add("Robson");
        nomeDoProfessor.getItems().add("Andrea");
        nomeDoProfessor.getItems().add("Anderson");
    }

    void adicionarDias() {
        diaDoUso.getItems().add("Segunda-feira");
        diaDoUso.getItems().add("Terça-feira");
        diaDoUso.getItems().add("Quarta-feira");
        diaDoUso.getItems().add("Quinta-feira");
        diaDoUso.getItems().add("Sexta-feira");
    }

    void adicionarEquipamentos() {
        equipamento.getItems().add("Notebook");
        equipamento.getItems().add("Monitor");
        equipamento.getItems().add("Teclado");
        equipamento.getItems().add("Mouse");
        equipamento.getItems().add("Impressora");
    }

    void adicionarHorarios() {
        horarioEntrega.getItems().add("07:00/07:50");
        horarioEntrega.getItems().add("07:50/08:50");
        horarioEntrega.getItems().add("09:10/10:00");
        horarioEntrega.getItems().add("10:00/10:50");
        horarioEntrega.getItems().add("10:50/11:40");
        horarioEntrega.getItems().add("13:00/13:50");
        horarioEntrega.getItems().add("13:50/14:40");
        horarioEntrega.getItems().add("15:00/15:50");
        horarioEntrega.getItems().add("15:50/16:40");
    }

    @FXML
    void abrirTelaInicio(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
    }

    @FXML
    void abrirVerRegistros(ActionEvent event) throws IOException {
        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }

    @FXML
    void enviar(ActionEvent event) throws IOException {
        emprestimoC.adicionarEmprestimo(
            nomeDoProfessor.getSelectionModel().getSelectedItem(),
            equipamento.getSelectionModel().getSelectedItem(),
            horarioEntrega.getSelectionModel().getSelectedItem(),
            diaDoUso.getSelectionModel().getSelectedItem()
        );

        for(int i = 0; i < emprestimoC.lista.size(); i++) {
            System.out.println(emprestimoC.lista.get(i).getProfessor());
            System.out.println(emprestimoC.lista.get(i).getDiaDoUso());
            System.out.println(emprestimoC.lista.get(i).getEquipamento());
            System.out.println(emprestimoC.lista.get(i).getHorarioEntrega());
        }

        Funcoes funcoes = new Funcoes();
        btnEnviar.getScene().getWindow().hide();
        funcoes.mudarTela(event, "verRegistros.fxml", "Ver registros");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        adicionarProfessores();
        adicionarDias();
        adicionarEquipamentos();
        adicionarHorarios();
    }
}