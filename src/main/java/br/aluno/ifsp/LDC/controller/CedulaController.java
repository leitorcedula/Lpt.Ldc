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

import br.aluno.ifsp.LDC.model.Cedula;
import br.aluno.ifsp.LDC.model.Moeda;
import br.aluno.ifsp.LDC.repository.CedulaRepository;

@RestController
@CrossOrigin
public class CedulaController {
    @Autowired
    CedulaRepository cedulaRepository;

    @PostMapping("/ldc/criaCedula")
    public Cedula createCedula(@RequestBody Cedula cedula){
        return cedulaRepository.save(cedula);
    }

    @DeleteMapping("/ldc/deletaCedula/{idCedula}")
    public void deleteCedula(@PathVariable Long idCedula){
        cedulaRepository.deleteById(idCedula);
    }

    
   

} 