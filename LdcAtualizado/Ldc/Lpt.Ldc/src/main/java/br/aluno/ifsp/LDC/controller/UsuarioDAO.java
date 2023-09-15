package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import br.aluno.ifsp.LDC.Database;
import br.aluno.ifsp.LDC.model.Usuario;

public class UsuarioDAO {

     private Database db;
     private static UsuarioDAO instance;

      //O construtor privado garante que uma única instância irá existir
     public UsuarioDAO() {

     }

      //Recupera a única instância do DAO
     public static UsuarioDAO getInstance() {
         if (instance == null) {
             instance = new UsuarioDAO();
         }
         return instance;
     }

      //Recupera a conexão com o Banco de Dados
     private Database getConnection() {
         if (this.db == null) {
             Database db = new Database();
             db.initUsuario();
             this.db = db;
         }
         return this.db;
     }

   //   Cria um novo Usuario
     public void create(Usuario novo) {
         Database db = getConnection();
         db.addDadoUsuario(novo);
     }

    //  Recupera todas as listas
     public ArrayList<Usuario> read() {
         Database db = getConnection();
         return db.recuperaDadoUsuario();
     }

     public void delete(Usuario deletar) {
          //Sem implementação
     }

     public void update(Usuario toUpdate) {
          //Sem implementação
     }


     public Usuario buscaUsuarioPorEmail(String email) {
     Database db = getConnection();
     ArrayList<Usuario> usuarios = db.recuperaDadoUsuario();
     for (Usuario usuario : usuarios) {
         if (usuario.getEmail().equals(email)) {
             return usuario;
         }
     }
     return null;
 }
}

