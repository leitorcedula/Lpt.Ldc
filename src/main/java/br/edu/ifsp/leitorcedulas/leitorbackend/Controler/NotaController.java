package br.edu.ifsp.leitorcedulas.leitorbackend.Controler;

import java.util.ArrayList;

import br.aluno.ifsp.LDC.dao.CedulaDAO;
import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class NotaControler {
    
    @PostMapping("/ldc/criarnota")
    public void CriarNota(@RequestBody Cedula novaCedula){
        CedulaDAO cedulaDAO = 
    }

}