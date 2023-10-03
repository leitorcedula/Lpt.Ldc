package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.repository.CedulaRepository;
import br.aluno.ifsp.LDC.model.Cedula;



@RestController
@CrossOrigin
public class CedulaController {

    @Autowired
    CedulaRepository cedulaRepository;

    @PostMapping("/ldc/criarCedula")
    public Cedula createCedula(@RequestBody Cedula cedula){
        return cedulaRepository.save(cedula);
    }

    @DeleteMapping("/ldc/deletarCedula/{idCedula}")
    public void deleteCedula(@PathVariable Long idCedula){
        cedulaRepository.deleteById(idCedula);
    }

    
   

} 




