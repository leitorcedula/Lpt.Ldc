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

//Valor = tipo da cedula, por exemplo. Se é nota de 5,10,20,50, 100 ou 200.
@Entity
public class Valor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Character tipo;
    
    @OneToOne(mappedBy = "Valor") 
    private Nota nota;
    
    public Valor() {
    }

    public Valor(Long id, Character tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
}