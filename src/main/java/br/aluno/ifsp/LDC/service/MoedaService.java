package br.aluno.ifsp.LDC.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aluno.ifsp.LDC.model.Moeda;
import br.aluno.ifsp.LDC.repository.MoedaRepository;

@Service
public class MoedaService {

    private final MoedaRepository moedaRepository;

    @Autowired
    public MoedaService(MoedaRepository moedaRepository) {
        this.moedaRepository = moedaRepository;
    }

    public void adicionarMoeda(Moeda novaMoeda) {
    }

    public Moeda buscarMoedaPorId(String idMoeda) {
        return null;
    }

    public void atualizarMoeda(Moeda moedaExistente) {
    }

    public boolean deletarMoedaPorId(String idMoeda) {
        return false;
    }

    // Métodos para operações de negócios relacionadas a moedas aqui...
}
