package br.aluno.ifsp.LDC.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Moeda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valor;
    private String idMoeda;
    private String cor;
    private double diametro;

    // Getters e setters

    public Moeda(double d, String string, String string2, double e) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIdMoeda() {
        return idMoeda;
    }

    public void setIdMoeda(String idMoeda) {
        this.idMoeda = idMoeda;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Moeda [id=" + id + ", valor=" + valor + ", idMoeda=" + idMoeda + ", cor=" + cor + ", diametro="
                + diametro + "]";
    }
}
