package br.aluno.ifsp.LDC.repository;

import org.springframework.data.repository.CrudRepository;

import br.aluno.ifsp.LDC.model.Cedula;

public interface CedulaRepository extends CrudRepository<Cedula, Long> {
    
}
