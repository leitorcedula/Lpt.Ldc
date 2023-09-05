package br.aluno.ifsp.LDC.controller;

import java.io.IOException;
import java.net.URL;

import br.edu.ifsp.javafx.aulas.App;
import br.edu.ifsp.javafx.aulas.dao.MoedaMetalDAO;
import br.edu.ifsp.javafx.aulas.model.MoedaMetal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditarMoedaController {

     @FXML
    private Label LabelSalvo;

    @FXML
    private Button btnEditarMoeda;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField inputCor;

    @FXML
    private TextField inputDiame;

    @FXML
    private TextField inputID;

    @FXML
    private TextField inputValor;


 public void initialize(){
        // Configuramos um evento no botão para pegar os dados dos campos e retorná-los

        btnEditarMoeda.setOnAction((ActionEvent event) ->{ 
           String idMoeda = inputID.getText();
           double valor = Double.parseDouble(inputValor.getText());
           double Diame = Double.parseDouble(inputDiame.getText());

           MoedaMetalDAO moedaMetalDAO = MoedaMetalDAO.getInstance();
           for (MoedaMetal moedaMetal : moedaMetalDAO.read()) {
               if (moedaMetal.getIdMoeda().equals(idMoeda)) {
                   moedaMetal.setValor(valor);
                   moedaMetal.setDiametro(Diame);
                   moedaMetalDAO.update(moedaMetal);
                   System.out.println(moedaMetal);
                   break;
               }
           }

           // Exiba uma mensagem indicando que os dados foram salvos
           LabelSalvo.setText("Valores atualizados com sucesso!");

          

        });  
        
        btnVoltar.setOnAction((ActionEvent event) ->{ 
            Back();
            closeCurrentWindow(event);
        }); 
    }

    private void closeCurrentWindow(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    private void Back(){
        try {
            URL path = App.class.getResource("MenuLogado.fxml");
            Parent root = FXMLLoader.load(path);
        
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
}
