package br.edu.ifsp.javafx.aulas.controller;

import java.io.IOException;
import java.net.URL;

import br.edu.ifsp.javafx.aulas.App;
import br.edu.ifsp.javafx.aulas.dao.UsuarioDAO;
import br.edu.ifsp.javafx.aulas.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button btnAcessar;

    @FXML
    private Button btnCadastro;

    @FXML
    private TextField inputEmail;

    @FXML
    private PasswordField inputSenha;

    

    public void initialize(){
        // Configuramos um evento no botão para pegar os dados dos campos e retorna-los
        btnAcessar.setOnAction((ActionEvent event) ->{ 
               String email = inputEmail.getText();
            String senha = inputSenha.getText();
            
            UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();
            Usuario usuario = usuarioDAO.buscaUsuarioPorEmail(email);
            
            if (usuario != null && usuario.getSenha().equals(senha)) {
                abreJanelaAcesso();
                closeCurrentWindow(event);
            } else {
              inputEmail.setText("Email ou Senha inválidos");
            }

           
        }); 

        btnCadastro.setOnAction((ActionEvent event) ->{            
            abreJanelaCadastro();
            closeCurrentWindow(event);
        }); 
    }

    private void abreJanelaAcesso() {
        // try-catch é o bloco de tratamento de exceções
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

    private void closeCurrentWindow(ActionEvent event) {
        
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    private void abreJanelaCadastro() {
        // try-catch é o bloco de tratamento de exceções
        try {
            URL path = App.class.getResource("CriarUsuario.fxml");
            Parent root = FXMLLoader.load(path);
        
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
