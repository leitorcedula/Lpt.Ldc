package br.edu.ifsp.javafx.aulas.model;

public 

class Pais {
    private String idPais;
    private String nomePais;

    
    public Pais(String idPais, String nomePais) {
        this.idPais = idPais;
        this.nomePais = nomePais;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
}
