package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.dao.CedulaDAO;
import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class NotaController {
    
    @PostMapping("/ldc/criarnota")
    public void CriarNota(@RequestBody Cedula novaCedula){
       // CedulaDAO cedulaDAO = 
    }

}
