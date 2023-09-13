package br.aluno.ifsp.LDC.dao;

import br.aluno.ifsp.LDC.database.Database;
import br.aluno.ifsp.LDC.model.MoedaMetal;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class MoedaMetalDAO {

    private Database db;
 private static MoedaMetalDAO instance;

     public MoedaMetalDAO() {
     }

     public static MoedaMetalDAO getInstance() {
        if (instance == null) {
           instance = new MoedaMetalDAO();
        }
     return instance;
 }

 public MoedaMetal encontraIdsMoedaMetal(String idMoeda) {
     for (MoedaMetal moedaDeletada : read()) {
         if (moedaDeletada.getIdMoeda().equals(idMoeda)) {
            return moedaDeletada;
         }
     }
    return null;
}

     private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.initMoedaMetal();
        this.db = db;
        }
        return this.db;
    }

    // public void create(MoedaMetal novo) {
    //     Database db = getConnection();
    //     db.addDadoMoedaMetal(novo);
    // }

    public ArrayList<MoedaMetal> read() {
       Database db = getConnection();
         return db.recuperaDadoMoedaMetal();
     }

    // public void deleteAll() {
    //     Database db = getConnection();
    //     db.recuperaDadoMoedaMetal().clear();
    // }

     public void delete(MoedaMetal deletar) {
        read().remove(deletar);
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
