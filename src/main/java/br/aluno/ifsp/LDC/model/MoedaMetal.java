package br.edu.ifsp.javafx.aulas.model;

public class MoedaMetal extends MoedaAbstrata implements MoedaInterface {
    private String cor;
    private double peso;
    private double diametro;

    
    public MoedaMetal(String idPais, double valor, String idMoeda, String cor, double peso,
            double diametro) {
        super(valor, idMoeda);
        this.cor = cor;
        this.peso = peso;
        this.diametro = diametro;
    }

    @Override
    void verificarAutenticidade() {
        System.out.println("Verificando autenticidade da moeda metálica...");
        // Lógica de verificação de autenticidade
    }

    @Override
    public String getTamanho() {
        return "Médio";
    }

    @Override
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "MoedaMetal [cor=" + cor + ", peso=" + peso + ", diametro=" + diametro + "]";
    }

    
}

