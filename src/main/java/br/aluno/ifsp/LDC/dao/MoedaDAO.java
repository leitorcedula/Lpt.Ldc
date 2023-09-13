package br.aluno.ifsp.LDC.dao;

import br.aluno.ifsp.LDC.model.Moeda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoedaDAO extends JpaRepository<Moeda, Long> {
    
}
