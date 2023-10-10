package br.aluno.ifsp.LDC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Usuario;
import br.aluno.ifsp.LDC.dao.UsuarioDAO;

@RestController
@RequestMapping("/usuario")
public class CriarUsuarioController {

    @GetMapping("/form")
    public String exibirFormulario() {
        return "formulario-usuario"; // Retorna a página do formulário
    }

    @PostMapping("/criar")
    public String criarUsuario(
        @RequestParam String inputIdUser,
        @RequestParam String inputDataN,
        @RequestParam String inputEmail,
        @RequestParam String inputSenha,
        @RequestParam String inputNome,
        @RequestParam String inputDef,
        Model model
    ) {

        inputIdUser = "1";
        inputDataN = "1";
        inputEmail = "1";
        inputSenha = "1";
        inputNome = "1";
        inputDef = "1";
     

        // Crie um novo usuário com os dados recebidos do formulário
        Usuario novoUsuario = new Usuario(inputIdUser, inputDataN, inputEmail, inputSenha, inputNome, inputDef, inputDef);

        // Salve o novo usuário no banco de dados
        UsuarioDAO cadDAO = UsuarioDAO.getInstance();
        cadDAO.create(novoUsuario);

        // Adicione o novo usuário ao modelo para exibição na página de confirmação
        model.addAttribute("novoUsuario", novoUsuario);

        return "usuario-criado"; // Retorna a página de confirmação
    }
}
