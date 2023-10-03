package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.repository.MoedaRepository;

 import br.aluno.ifsp.LDC.model.Moeda;


@RestController
@CrossOrigin
public class MoedaController {
     @Autowired
    MoedaRepository moedaRepository;

    @PostMapping("/ldc/criarMoeda")
    public Moeda createCedula(@RequestBody Moeda moeda){
        return moedaRepository.save(moeda);
    }
     @GetMapping("ldc/mostrarMoeda/{moedaId}")
    public Optional<Moeda> getMoedaById(@PathVariable Long moedaId) {
        return moedaRepository.findById(moedaId);
            
    }
    
}
 