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

// quanto = quantidade de notas que tem sobre determinado valor
@Entity
public class Quantidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Character quanto;

    
    @OneToOne(mappedBy = "Quantidade") 
    private Informacao informacao;
    
    public Quantidade() {
    }

    public Quantidade(Long id, Character quanto) {
        this.id = id;
        this.quanto = quanto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getquanto() {
        return quanto;
    }

    public void setquanto(Character quanto) {
        this.quanto = quanto;
    }

    public Informacao getInformacao() {
        return informacao;
    }

    public void setInformacao(Informacao informacao) {
        this.informacao = informacao;
    }
}