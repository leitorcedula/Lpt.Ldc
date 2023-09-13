package br.aluno.ifsp.LDC.repository;



import br.aluno.ifsp.LDC.model.Moeda;
import org.springframework.data.repository.CrudRepository;

public interface MoedaRepository extends CrudRepository<Moeda, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
