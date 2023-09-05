package br.edu.ifsp.javafx.aulas.controller;


import java.io.IOException;

import java.net.URL;


import br.edu.ifsp.javafx.aulas.App;
import br.edu.ifsp.javafx.aulas.dao.CedulaDAO;
import br.edu.ifsp.javafx.aulas.dao.MoedaMetalDAO;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuLogadoController {

   
    @FXML
    private Button btnAdicionarMoeda;

    @FXML
    private MenuItem btnAdicionarNota;

    @FXML
    private Button btnEditarMoeda;

    @FXML
    private Button btnEditarNota;

    @FXML
    private Button btnExcluirMoeda;

    @FXML
    private Button btnExcluirNota;

    @FXML
    private Button btnHist;

    @FXML
    private MenuButton btnMoeda;

    @FXML
    private MenuButton btnNota;

    @FXML
    private Button btnSair;

   


    public void initialize(){
        // Configuramos um evento no botão para pegar os dados dos campos e retorna-los

        btnSair.setOnAction((ActionEvent event) ->{ 
            Sair();
            closeCurrentWindow(event);
            
        });


        btnAdicionarMoeda.setOnAction((ActionEvent event) ->{ 
            JanelaAdMd();
            
            
        });

        btnEditarMoeda.setOnAction((ActionEvent event) ->{ 
            JanelaEdMd();
            
        });

        btnExcluirMoeda.setOnAction((ActionEvent event) -> {
        MoedaMetalDAO moedaMetalDAO = MoedaMetalDAO.getInstance();
        moedaMetalDAO.deleteAll();
        });

        btnAdicionarNota.setOnAction((ActionEvent event) ->{ 
             JanelaAdNt();
             
            
        });
          
        btnEditarNota.setOnAction((ActionEvent event) ->{ 
            JanelaEdNt();
            
        });

        btnExcluirNota.setOnAction((ActionEvent event) -> {
        CedulaDAO cedulaDAO = CedulaDAO.getInstance();
        cedulaDAO.deleteAll();
        });
        
        btnHist.setOnAction((ActionEvent event) ->{ 
            JanelaHist();
            closeCurrentWindow(event);
        });

    

        
    }
        private void closeCurrentWindow(ActionEvent event) {
        
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
 
    
        private void Sair(){   
        try {
        URL path = App.class.getResource("Menu.fxml");
        Parent root = FXMLLoader.load(path);
    
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }

        private void JanelaAdNt(){
           
            try {
            URL path = App.class.getResource("AdicionaNota.fxml");
            Parent root = FXMLLoader.load(path);
        
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        private void JanelaEdNt(){
               
             try {
            URL path = App.class.getResource("EditarNota.fxml");
            Parent root = FXMLLoader.load(path);
        
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        } 

        private void JanelaAdMd(){
                   
        try {
        URL path = App.class.getResource("AdicionaMoeda.fxml");
        Parent root = FXMLLoader.load(path);
    
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        
        private void JanelaEdMd(){
                
        try {
        URL path = App.class.getResource("EditarMoeda.fxml");
        Parent root = FXMLLoader.load(path);
    
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        } 

        private void JanelaHist(){
            try {
        URL path = App.class.getResource("Historico.fxml");
        Parent root = FXMLLoader.load(path);
    
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
        
    


}
