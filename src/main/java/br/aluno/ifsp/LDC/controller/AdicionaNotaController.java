package br.edu.ifsp.javafx.aulas.controller;

import java.io.IOException;
import java.net.URL;

import br.edu.ifsp.javafx.aulas.App;
import br.edu.ifsp.javafx.aulas.dao.CedulaDAO;

import br.edu.ifsp.javafx.aulas.model.Cedula;



public class AdicionaNotaController {

     @FXML
    private Label LabelSalvo;

    @FXML
    private Button btnAdicionaNota;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField inputAltura;

    @FXML
    private TextField inputID;

    @FXML
    private TextField inputLargura;

    @FXML
    private TextField inputValor;

    public void initialize(){
        // Configuramos um evento no botão para pegar os dados dos campos e retorna-los

       

        btnAdicionaNota.setOnAction((ActionEvent event) ->{ 
            
            String texto = inputValor.getText();
            double valor = Double.parseDouble(texto);

            String texto2 = inputLargura.getText();
            double largura = Double.parseDouble(texto2);

            

            String texto3 = inputAltura.getText();
            double altura = Double.parseDouble(texto3);

            
         Cedula cedula = new Cedula("", valor, inputID.getText(), largura, altura);
        // App.listaCadastros.add(novoCadastro);
        // Uso do DAO
        CedulaDAO cedulaDAO = CedulaDAO.getInstance();   
        cedulaDAO.create(cedula); 
        LabelSalvo.setText("Cadastro Salvo!");    
       
        System.out.println(cedula);

           
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
