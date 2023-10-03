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
    public String createCedula(@RequestBody Cedula cedula){
        cedulaRepository.save(cedula);
        return "Cédula Salva";
    }
    @DeleteMapping("/ldc/deletarCedula/{idCedula}")
    public String deleteCedula(@PathVariable Long idCedula){
        cedulaRepository.deleteById(idCedula);
        return "Cédula Apagada com sucesso!";
    }
} 