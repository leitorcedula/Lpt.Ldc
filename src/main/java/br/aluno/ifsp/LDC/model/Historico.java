package br.edu.ifsp.javafx.aulas.model;

import java.time.LocalDate;

public class Historico {
    private double valor;
    private String id;
    private LocalDate data;

    public Historico(double valor, String id, LocalDate data) {
        this.valor = valor;
        this.id = id;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }
}