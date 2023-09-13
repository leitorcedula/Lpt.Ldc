package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.dao.CedulaDAO;
import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class CedulaController {
    @Autowired
    private CedulaDAO cedulaDeletada = CedulaDAO.getInstance();
    
    @PostMapping("/ldc/criacedula")
    public String CriarCedula(@RequestBody Cedula novaCedula){
        CedulaDAO cedulaDAO = CedulaDAO.getInstance();
        return "Cédula criadaa com sucesso!";
    }
    @DeleteMapping("/ldc/deletaCedula/{idMoeda}")
    public String deletarCedula(@PathVariable("idMoeda") String idMoeda) {
        Cedula cedulaDeletar = cedulaDeletada.encontraIdsCedula(idMoeda);

        if (cedulaDeletar != null) {
            cedulaDeletada.delete(cedulaDeletar);
            return "Cedula excluída!";
        } else {
            return "Id da Cedula não encontrado.";
        }

    }
}