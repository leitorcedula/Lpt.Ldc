package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.dao.CedulaDAO;
import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class CedulaController {
    
    @PostMapping("/ldc/criacedula")
    public String CriarCedula(@RequestBody Cedula novaCedula){
        CedulaDAO cedulaDAO = CedulaDAO.getInstance();
        return "Cédula criada com sucesso!";
    }

}