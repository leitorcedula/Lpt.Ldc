package br.aluno.ifsp.LDC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.aluno.ifsp.LDC.model.Nota;
import br.aluno.ifsp.LDC.repository.NotaRepository;


@RestController
@RequestMapping("/api/bd/notas")
public class NotaController {

    @Autowired
    private NotaRepository notaRepository;

    @PostMapping("/adicionarNota")
    public void adicionarNota(@RequestBody Nota nota) {
        notaRepository.save(nota);
    }

    @GetMapping("/notas")
    public List<Nota> getAllNotas() {
        return notaRepository.findAll();
    }   
}
