package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class TelaInicioController {

    @FXML
    private Button btnSim;
    
    @FXML
    private Button btnnao;
    
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    void BtnTutor(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("TelaTutorial.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Tutorial");
        stage.show();

    }

    @FXML
    void btnskip(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("MenuInicial.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menu Inicial");
        stage.show();

    }

}
