package view;
import java.util.ArrayList;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;

public class FazerRegistrosController implements Initializable {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private Button btnEnviar;

    @FXML
    private DatePicker diaDoUso;

    @FXML
    private ChoiceBox<String> equipamento;

    @FXML
    private ChoiceBox<String> horarioEntrega;

    @FXML
    private ImageView iconConfig;

    @FXML
    private ChoiceBox<String> nomeDoProfessor;

    @FXML
    private Hyperlink verRegistros;

    

     ArrayList<String> professor = new ArrayList<String>();
     ArrayList<String> material = new ArrayList<String>();
     




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
    void enviar(ActionEvent event) {
        
    }


    @Override
	public void initialize(URL url, ResourceBundle reb) {
		
        //Adiciona os nomes dos professores no Array de professores.
        professor.add("Alcides");
        professor.add("Anderson");
        professor.add("Andrea");
        professor.add("Clemilton");
        professor.add("Escolástica");
        professor.add("Giselly");
        professor.add("Josy");
		professor.add("Juscélio");
        professor.add("Madalena");
        professor.add("Morgama");
        professor.add("Mozean");
        professor.add("Raab");
        professor.add("Robson");
        professor.add("Rodrigo");
        professor.add("Wendel");
        professor.add("Zilma");

        material.add("Projetor");
        material.add("Extensão");
        material.add("Notebook");
        material.add("Cabo USB");
        material.add("Caixa de Som");
        
        //Adiciona os nomes dos professores presentes no ArrayList no CheckBox de Professores
        nomeDoProfessor.getItems().addAll(professor);
         //Adiciona os equipamentos presentes no ArrayList no CheckBox de Equipamentos
        equipamento.getItems().addAll(material);
	
    }
    }
