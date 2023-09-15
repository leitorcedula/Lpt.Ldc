package br.aluno.ifsp.LDC.controller;
import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Cedula;
import br.aluno.ifsp.LDC.model.Usuario;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @GetMapping("/api/bd/notas")
    public ArrayList<Cedula> endPoint3() {
        CedulaDAO dao = CedulaDAO.getInstance();
        return dao.read();
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

        inputIdUser = "2";
        inputDataN = "3";
        inputEmail = "2";
        inputSenha = "1";
        inputNome = "2";
        inputDef = "3";
          
        Usuario novoUsuario = new Usuario(inputIdUser, inputDataN, inputEmail, inputSenha, inputNome, inputDef, inputDef);

        UsuarioDAO cadDAO = UsuarioDAO.getInstance();
        cadDAO.create(novoUsuario);

          model.addAttribute("novoUsuario", novoUsuario);

        return "usuario-criado"; 
    }
}
