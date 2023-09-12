// package br.aluno.ifsp.LDC.controller;

// import java.io.IOException;
// import java.net.URL;

// import  br.aluno.ifsp.LDC.LdcApplication;

// import br.aluno.ifsp.LDC.model.Usuario;


// public class CriarUsuarioController {

   
    

//     public void initialize(){
//         // Configuramos um evento no botão para pegar os dados dos campos e retorna-los

        

//         // btnSalvar.setOnAction((ActionEvent event) ->{ 
            
//         //     Usuario novoUsuario = new Usuario(inputIdUser.getText(), inputDataN.getText(),
//         //      inputEmail.getText(), inputSenha.getText(), inputNome.getText(), inputLocal.getText(), inputDef.getText());
//         // // App.listaCadastros.add(novoCadastro);
//         // // Uso do DAO
//         // UsuarioDAO cadDAO = UsuarioDAO.getInstance();   
//         // cadDAO.create(novoUsuario);     
//         // LabelSalvo.setText("Cadastro Salvo!");
//         // System.out.println(novoUsuario);


           
//         // });      
//     }


    
   
// }

package br.aluno.ifsp.LDC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CriarUsuarioController {

    @GetMapping("/criarUsuario")
    public String criarUsuario() {
        // Lógica para criar um novo usuário
        return "criarUsuario"; // Retorna a página de criação de usuário
    }

    // Outros métodos e lógica do controlador
}


