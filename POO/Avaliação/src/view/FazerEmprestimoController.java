package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import control.EmprestimoC;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FazerEmprestimoController {

    EmprestimoC emprestimoC = EmprestimoC.getInstancia();
    Funcoes funcoes = Funcoes.getInstancia();

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
    private Hyperlink verEmprestimos;

    @FXML
    private Hyperlink tutorial;
    
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
        equipamento.getItems().add("ThinkPad 1");
        equipamento.getItems().add("ThinkPad 2");
        equipamento.getItems().add("ThinkPad 3");
        equipamento.getItems().add("Projetor 1");
        equipamento.getItems().add("Projetor 2");
        equipamento.getItems().add("Projetor 3");
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
        funcoes.mudarTela(event, "menuInicial.fxml", "Menu inicial");
        final Stage stage = (Stage) btnEnviar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void abrirVerEmprestimos(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver empréstimos");
        final Stage stage = (Stage) btnEnviar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void abrirTutorial(ActionEvent event) throws IOException {
        funcoes.mudarTela(event, "telaTutorial.fxml", "Tutorial");
        final Stage stage = (Stage) btnEnviar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void enviar(ActionEvent event) throws IOException, ClassNotFoundException {
        if(nomeDoProfessor.getValue() == null ||
                equipamento.getValue() == null ||
                horarioEntrega.getValue() == null ||
                diaDoUso.getValue() == null) {
            funcoes.alertaErro("Preencha todos os campos!");
            return;
        }

        for(int i = 0; i < emprestimoC.lista.size(); i++) {
            if(equipamento.getValue() == emprestimoC.lista.get(i).getEquipamento() &&
                    horarioEntrega.getValue() == emprestimoC.lista.get(i).getHorarioEntrega() &&
                    diaDoUso.getValue() == emprestimoC.lista.get(i).getDiaDoUso()) {
                funcoes.alertaErro("Equipamento já está emprestado!");
                return;
            }
        }
        
        emprestimoC.adicionarEmprestimo(
            nomeDoProfessor.getValue(),
            equipamento.getValue(),
            horarioEntrega.getValue(),
            diaDoUso.getValue()
        );

        ObjectOutput out = null;
        out = new ObjectOutputStream(new FileOutputStream("emprestimoC.ser"));
        out.writeObject(emprestimoC);
        out.close();

        funcoes.mudarTela(event, "verEmprestimos.fxml", "Ver empréstimos");
        final Stage stage = (Stage) btnEnviar.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    public void initialize() throws IOException, ClassNotFoundException {
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("emprestimoC.ser"));
            emprestimoC = (EmprestimoC) in.readObject();
            in.close();
        } catch (IOException e) {
            System.out.println("Nenhum arquivo de empréstimos encontrado");
        }
        
        adicionarProfessores();
        adicionarDias();
        adicionarEquipamentos();
        adicionarHorarios();
    }

}