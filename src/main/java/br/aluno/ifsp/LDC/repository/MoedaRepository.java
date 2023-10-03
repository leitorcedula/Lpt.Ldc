package br.aluno.ifsp.LDC.repository;

import org.springframework.data.repository.CrudRepository;

import br.aluno.ifsp.LDC.model.Moeda;

public interface MoedaRepository extends CrudRepository<Moeda, Long> {
    
}
