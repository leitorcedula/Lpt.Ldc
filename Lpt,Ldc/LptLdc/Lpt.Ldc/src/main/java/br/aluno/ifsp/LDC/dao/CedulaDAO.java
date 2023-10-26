package br.aluno.ifsp.LDC.dao;
import br.aluno.ifsp.LDC.database.Database;
import br.aluno.ifsp.LDC.model.Cedula;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class CedulaDAO {

    private Database db;
 private static CedulaDAO instance;

     public CedulaDAO() {
     }

     public static CedulaDAO getInstance() {
        if (instance == null) {
           instance = new CedulaDAO();
        }
     return instance;
 }

 public Cedula encontraIdsCedula(String idMoeda) {
     for (Cedula cedulaDeletada : read()) {
         if (cedulaDeletada.getIdMoeda().equals(idMoeda)) {
            return cedulaDeletada;
         }
     }
    return null;
}

     private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.initCedula();
        this.db = db;
        }
        return this.db;
    }

    // public void create(Cedula novo) {
    //     Database db = getConnection();
    //     db.addDadoCedula(novo);
    // }

    public ArrayList<Cedula> read() {
       Database db = getConnection();
         return db.recuperaDadoCedula();
     }

    // public void deleteAll() {
    //     Database db = getConnection();
    //     db.recuperaDadoCedula().clear();
    // }

     public void delete(Cedula deletar) {
        read().remove(deletar);
    }

     public void update(Cedula toUpdate) {
         Database db = getConnection();
         ArrayList<Cedula> moedasMetais = db.recuperaDadoCedula();
         for (int i = 0; i < moedasMetais.size(); i++) {
             Cedula Cedula = moedasMetais.get(i);
             if (Cedula.getIdMoeda().equals(toUpdate.getIdMoeda())) {
                moedasMetais.set(i, toUpdate);
                System.out.println("Moeda atualizada: " + toUpdate);
                 break;
             }
         }
     }
}

