package br.edu.ifsp.javafx.aulas.controller;

import java.io.IOException;
import java.net.URL;

import br.edu.ifsp.javafx.aulas.App;
import br.edu.ifsp.javafx.aulas.dao.CedulaDAO;
import br.edu.ifsp.javafx.aulas.model.Cedula;

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


public class EditarNotaController {

    @FXML
    private Label LabelSalvo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField inputAltura;

    @FXML
    private TextField inputLargura;

    @FXML
    private TextField inputID;

    @FXML
    private TextField inputValor;
    
    


    public void initialize(){
        // Configuramos um evento no botão para pegar os dados dos campos e retorna-los

       

        btnSalvar.setOnAction((ActionEvent event) ->{ 
           String idMoeda = inputID.getText();
        double valor = Double.parseDouble(inputValor.getText());
        double largura = Double.parseDouble(inputLargura.getText());
        double altura = Double.parseDouble(inputAltura.getText());

        CedulaDAO cedulaDAO = CedulaDAO.getInstance();
        for (Cedula cedula : cedulaDAO.read()) {
            if (cedula.getIdMoeda().equals(idMoeda)) {
                cedula.setValor(valor);
                cedula.setLargura(largura);
                cedula.setAltura(altura);
                cedulaDAO.update(cedula);
                 System.out.println(cedula);
                break;

            }
        }
       

        // Exiba uma mensagem indicando que os dados foram salvos
         
        LabelSalvo.setText("Valores atualizados com sucesso!");

        // Feche a janela atual após 2 segundos
        
           
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
