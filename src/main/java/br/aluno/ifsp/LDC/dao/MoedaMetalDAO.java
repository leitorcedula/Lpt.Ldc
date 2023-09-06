package br.edu.ifsp.javafx.aulas.dao;

import br.edu.ifsp.javafx.aulas.database.Database;
import br.edu.ifsp.javafx.aulas.model.MoedaMetal;

import java.util.ArrayList;

public class MoedaMetalDAO {

    private Database db;
    private static MoedaMetalDAO instance;

    private MoedaMetalDAO() {
    }

    public static MoedaMetalDAO getInstance() {
        if (instance == null) {
            instance = new MoedaMetalDAO();
        }
        return instance;
    }

    private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.initMoedaMetal();
            this.db = db;
        }
        return this.db;
    }

    public void create(MoedaMetal novo) {
        Database db = getConnection();
        db.addDadoMoedaMetal(novo);
    }

    public ArrayList<MoedaMetal> read() {
        Database db = getConnection();
        return db.recuperaDadoMoedaMetal();
    }

    public void deleteAll() {
        Database db = getConnection();
        db.recuperaDadoMoedaMetal().clear();
    }

    public void delete(MoedaMetal deletar) {
        // Sem implementação
    }

    public void update(MoedaMetal toUpdate) {
        Database db = getConnection();
        ArrayList<MoedaMetal> moedasMetais = db.recuperaDadoMoedaMetal();
        for (int i = 0; i < moedasMetais.size(); i++) {
            MoedaMetal moedaMetal = moedasMetais.get(i);
            if (moedaMetal.getIdMoeda().equals(toUpdate.getIdMoeda())) {
                moedasMetais.set(i, toUpdate);
                System.out.println("Moeda atualizada: " + toUpdate);
                break;
            }
        }
    }
}
