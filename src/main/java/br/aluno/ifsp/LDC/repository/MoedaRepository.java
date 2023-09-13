package br.aluno.ifsp.LDC.repository;



import br.aluno.ifsp.LDC.model.MoedaMetal;
import org.springframework.data.repository.CrudRepository;

public interface MoedaRepository extends CrudRepository<MoedaMetal, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
