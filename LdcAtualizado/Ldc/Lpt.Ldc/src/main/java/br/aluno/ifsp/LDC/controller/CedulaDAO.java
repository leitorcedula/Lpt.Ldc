package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import br.aluno.ifsp.LDC.Database;
import br.aluno.ifsp.LDC.model.Cedula;

public class CedulaDAO {

    private Database db;
    private static CedulaDAO instance;

    // // O construtor privado garante que uma única instância irá existir
    private CedulaDAO() {

    }

    // // Recupera a única instância do DAO
    public static CedulaDAO getInstance() {
        if (instance == null) {
            instance = new CedulaDAO();
        }
        return instance;
    }

    public ArrayList<Cedula> read() {
        Database db = getConnection();
        return db.recuperaDadoCedula();
    }

    private Database getConnection() {
        if(db == null){
            db = new Database();
            db.initCedula();
        }
        return db;
    }

    // // Cria um novo Cedula
    public void create(Cedula novo) {
    Database db = getConnection();
    db.addDadoCedula(novo);
    }

    // // Recupera todas as listas
    // public ArrayList<Cedula> read() {
    // Database db = getConnection();
    // return db.recuperaDadoCedula();
    // }

    // // Deleta todas as moedasMetais
    // public void deleteAll() {
    // Database db = getConnection();
    // db.recuperaDadoCedula().clear();
    // }

    // public void delete(Cedula deletar) {
    // // Sem implementação
    // }

    // public void update(Cedula toUpdate) {
    // Database db = getConnection();
    // ArrayList<Cedula> cedulas = db.recuperaDadoCedula();
    // for (int i = 0; i < cedulas.size(); i++) {
    // Cedula cedula = cedulas.get(i);
    // if (cedula.getIdMoeda().equals(toUpdate.getIdMoeda())) {
    // cedulas.set(i, toUpdate);
    // break;
    // }
    // }
    // }

    // public Cedula getByIdMoeda(String idMoeda) {
    // return null;
    // }
}
