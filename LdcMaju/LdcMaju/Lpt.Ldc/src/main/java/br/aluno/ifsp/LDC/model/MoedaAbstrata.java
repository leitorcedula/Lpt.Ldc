package br.aluno.ifsp.LDC.model;

public abstract class MoedaAbstrata {
    
    private double valor;

    private String idMoeda;

    abstract void verificarAutenticidade();

    
    public MoedaAbstrata(double valor, String idMoeda) {
       
       
        this.valor = valor;
        
        this.idMoeda = idMoeda;
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
}
