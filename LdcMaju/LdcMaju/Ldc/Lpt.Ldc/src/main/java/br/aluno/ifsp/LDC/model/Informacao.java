package br.aluno.ifsp.LDC.controller;

import java.util.List;

import org.springframework.beans.factory.aninformacaotion.Autowired;
import org.springframework.web.bind.aninformacaotion.GetMapping;
import org.springframework.web.bind.aninformacaotion.PostMapping;
import org.springframework.web.bind.aninformacaotion.RequestBody;
import org.springframework.web.bind.aninformacaotion.RequestMapping;
import org.springframework.web.bind.aninformacaotion.RestController;

import br.aluno.ifsp.LDC.model.Cedula;
import br.aluno.ifsp.LDC.repository.CedulaRepository;

@RestController
public class InformacaoController {

    @Autowired
    public InformacaoRepository informacaoRepository;

    @PostMapping("/adicionarInformacao")
    public void adicionarInformacao( 
        @RequestBody Informacao informacao
    ){
        repo.save(informacao);
    }

    @GetMapping("/informacao")
    public List<Informacao> getAllInformacao() {
        return (List<Livro>)repo.findAll();
    }   
}
