package br.aluno.ifsp.LDC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.aluno.ifsp.LDC.model.Informacao;
import br.aluno.ifsp.LDC.repository.InformacaoRepository;

@RestController
@RequestMapping("/api/bd/informacoes")
public class InformacaoController {

    @Autowired
    private InformacaoRepository informacaoRepository;

    @PostMapping("/adicionarInformacao")
    public void adicionarInformacao(@RequestBody Informacao informacao) {
        informacaoRepository.save(informacao);
    }

    @GetMapping("/informacoes")
    public List<Informacao> getAllInformacoes() {
        return informacaoRepository.findAll();
    }
}