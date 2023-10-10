package br.aluno.ifsp.LDC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Cedula;
import br.aluno.ifsp.LDC.repository.CedulaRepository;

@RestController
@RequestMapping("/api/bd/notas")
public class NotaController {

    @Autowired
    public NotaRepository notaRepository;

    @PostMapping("/adicionarNota")
    public void adicionarNota( 
        @RequestBody Nota nota
    ){
        repo.save(nota);
    }

    @GetMapping("/nota")
    public List<Nota> getAllNota() {
        return (List<Livro>)repo.findAll();
    }   
}
