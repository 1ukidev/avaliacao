package view;
import java.util.ArrayList;
import java.io.IOException;
import java.time.LocalDate;
import java.net.URL;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;

public class FazerRegistrosController implements Initializable {

    @FXML
    private Hyperlink Inicio;

    @FXML
    private TextField horarioEntrega;

    @FXML
    private Button btnEnviar;

    @FXML
    private DatePicker diaDoUso;

    @FXML
    private ChoiceBox<String> equipamento;

    @FXML
    private ImageView iconConfig;

    @FXML
    private ChoiceBox<String> nomeDoProfessor;

    @FXML
    private Hyperlink verRegistros;

     public String pessoa;
     public String pegouEquipamento;
     public String horas;

     ArrayList<String> professor = new ArrayList<String>();
     ArrayList<String> material = new ArrayList<String>();
     
     Alert alerta = new Alert(AlertType.NONE);





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
/* 
    public void setinformations(ActionEvent event){

      
        
      }
*/
    @FXML
    void enviar(ActionEvent event){

    

    pessoa = nomeDoProfessor.getValue();
    pegouEquipamento = equipamento.getValue();
    LocalDate data = diaDoUso.getValue();
    horas = horarioEntrega.getText();

    if(pessoa==null || pegouEquipamento==null || data==null || horarioEntrega==null){

      alerta.setAlertType(AlertType.ERROR);
      alerta.setTitle("ERRO DE CADASTRO");
      alerta.setHeaderText("Insira todas as informações corretamente para poder efetuar o registro.");
      alerta.show();

      }else{
 
      alerta.setAlertType(AlertType.INFORMATION);
      alerta.setTitle("Registro realizado com sucesso!");
      alerta.setHeaderText("A reserva de "+pessoa+" foi registrada!");
      alerta.show();


    System.out.println(pessoa);
    System.out.println(pegouEquipamento);
    System.out.println(data);
    System.out.println(horas);
        
    }
}


}
    
