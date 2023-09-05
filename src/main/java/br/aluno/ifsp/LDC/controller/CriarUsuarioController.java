package br.aluno.ifsp.LDC.controller;

import java.io.IOException;
import java.net.URL;

import br.edu.ifsp.javafx.aulas.App;

import br.edu.ifsp.javafx.aulas.model.Usuario;


public class CriarUsuarioController {

    @FXML
    private Label LabelSalvo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField inputDataN;

    @FXML
    private TextField inputDef;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputIdUser;

    @FXML
    private TextField inputLocal;

    @FXML
    private TextField inputNome;

    @FXML
    private PasswordField inputSenha;

    

    public void initialize(){
        // Configuramos um evento no botão para pegar os dados dos campos e retorna-los

        btnVoltar.setOnAction((ActionEvent event) ->{ 
            abreJanelaMenu();
            closeCurrentWindow(event);


        });

        btnSalvar.setOnAction((ActionEvent event) ->{ 
            
            Usuario novoUsuario = new Usuario(inputIdUser.getText(), inputDataN.getText(),
             inputEmail.getText(), inputSenha.getText(), inputNome.getText(), inputLocal.getText(), inputDef.getText());
        // App.listaCadastros.add(novoCadastro);
        // Uso do DAO
        UsuarioDAO cadDAO = UsuarioDAO.getInstance();   
        cadDAO.create(novoUsuario);     
        LabelSalvo.setText("Cadastro Salvo!");
        System.out.println(novoUsuario);


           
        });      
    }


    private void closeCurrentWindow(ActionEvent event) {
        
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    private void abreJanelaMenu() {
            // try-catch é o bloco de tratamento de exceções
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
}
