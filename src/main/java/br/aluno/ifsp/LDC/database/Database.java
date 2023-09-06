package br.edu.ifsp.javafx.aulas.database;

import java.util.ArrayList;


import br.edu.ifsp.javafx.aulas.model.Cedula;
import br.edu.ifsp.javafx.aulas.model.Usuario;

//import br.edu.ifsp.javafx.aulas.model.Cotacao;
import br.edu.ifsp.javafx.aulas.model.Pais;
import br.edu.ifsp.javafx.aulas.model.MoedaMetal;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!
// Exemplo do professor sobre BDD
//
public class Database {
  private ArrayList<Cedula> cedulas;
  private ArrayList<Usuario> usuarios;
 
 // private ArrayList<Cotacao> cotacoes;
  private ArrayList<Pais> paises;
  private ArrayList<MoedaMetal> moedasMetais;

  // É void mesmo?
  public Database() {
        cedulas = new ArrayList<>();
        usuarios = new ArrayList<>();
        
        //cotacoes = new ArrayList<>();
        paises = new ArrayList<>();
        moedasMetais = new ArrayList<>();
    }

  public void initCedula() {
    cedulas.add(new Cedula("123", 10.0, "1", 87.75, 13.5));
    cedulas.add(new Cedula("123", 20.0, "2", 10, 5));
    // cedulas.add(new Cedula("Cad3","End3", 456));
  }

  public void addDadoCedula(Cedula novo) {
    cedulas.add(novo);
  }

  public ArrayList<Cedula> recuperaDadoCedula() {
    return cedulas;
  }

  public void deletarCedula(String idMoeda) {
    Cedula cedulaExcluir = null;
    for (Cedula cedula : cedulas) {
      if (cedula.getIdMoeda().equals(idMoeda)) {
        cedulaExcluir = cedula;
        break;
      }
    }
    if (cedulaExcluir != null) {
      cedulas.remove(cedulaExcluir);
      // Colocar na tela: Cedula removido com sucesso: " + cedulaExcluir.getValor()
    } else {
      // Colocar na tela: Cedula não encontrado com o ID: " + id
    }
  }

  // É void mesmo?

  public void update(Cedula toUpdate) {
    Database db = getConnection();
    ArrayList<Cedula> cedulas = db.recuperaDadoCedula();
    for (int i = 0; i < cedulas.size(); i++) {
        Cedula cedula = cedulas.get(i);
        if (cedula.getIdMoeda().equals(toUpdate.getIdMoeda())) {
           
            cedula.setValor(toUpdate.getValor());
            cedula.setLargura(toUpdate.getLargura());
            cedula.setAltura(toUpdate.getAltura());
            break;
        }
    }
}
  

  private Database getConnection() {
    return null;
  }

  public void initUsuario() {
    usuarios.add(new Usuario("001", "10.0", "p@", "123", "Ana", "87.75", "13.5"));
    usuarios.add(new Usuario("002", "100.0", "user2@yahoo.com", "126", "Marcos", "109.2", "15.6"));
    usuarios.add(new Usuario("003", "100.0", "user3@ig.com.br", "124", "Joab", "109.2", "15.6"));
  }

  public void addDadoUsuario(Usuario novo) {
    usuarios.add(novo);
  }

  public ArrayList<Usuario> recuperaDadoUsuario() {
    return usuarios;
  }

  public void deletarUsuario(String email) {
    Usuario usuarioExcluir = null;
    for (Usuario usuario : usuarios) {
      if (usuario.getEmail().equals(email)) {
        usuarioExcluir = usuario;
        break;
      }
    }
    if (usuarioExcluir != null) {
      usuarios.remove(usuarioExcluir);
      // Colocar na tela: Usuário removido com sucesso: " +
      // usuarioExcluir.getNomeUsuario()
    } else {
      // Colocar na tela: Usuário não encontrado com o ID: " + id
    }
  }
/* 

  public void DatabaseCotacao() {
    cotacoes = new ArrayList<>();
  }

  public void initCotacao() {
    cotacoes.add(new Cotacao("123", "124", "20/05/2023", 2.2));
    cotacoes.add(new Cotacao("124", "123", "20/05/2023", 2.2));
    cotacoes.add(new Cotacao("125", "123", "20/05/2023", 1.0));
    // cotacoes.add(new Cotacao("Cad3","End3", 456));
  }

  public void addDadoCotacao(Cotacao novo) {
    cotacoes.add(novo);
  }

  public ArrayList<Cotacao> recuperaDadoCotacao() {
    return cotacoes;
  }

  public void deletarCotacao(String idMoeda1, String idMoeda2) {
    Cotacao cotacaoExcluir = null;
    for (Cotacao cotacao : cotacoes) {
      if (cotacao.getIdMoeda1().equals(idMoeda1) && cotacao.getIdMoeda2().equals(idMoeda2)) {
        cotacaoExcluir = cotacao;
        break;
      }
    }
    if (cotacaoExcluir != null) {
      cotacoes.remove(cotacaoExcluir);
      // Colocar na tela: Cedula removido com sucesso: " + cedulaExcluir.getValor()
    } else {
      // Colocar na tela: Cedula não encontrado com o ID: " + id
    }
  }
*/
  

  public void initPais() {
    paises.add(new Pais("010", "Brasil"));
    paises.add(new Pais("011", "Estados Unidos da América"));
    paises.add(new Pais("012", "Inglaterra"));
    // paises.add(new Pais("Cad3","End3", 456));
  }

  public void addDadoPais(Pais novo) {
    paises.add(novo);
  }

  public ArrayList<Pais> recuperaDadoPais() {
    return paises;
  }

  public void deletarPais(String idPais, String nomePais) {
    Pais paisExcluir = null;
    for (Pais pais : paises) {
      if (pais.getIdPais().equals(idPais) && pais.getNomePais().equals(nomePais)) {
        paisExcluir = pais;
        break;
      }
    }
    if (paisExcluir != null) {
      paises.remove(paisExcluir);
      // Colocar na tela: Cedula removido com sucesso: " + cedulaExcluir.getValor()
    } else {
      // Colocar na tela: Cedula não encontrado com o ID: " + id
    }
  }


  

  public void initMoedaMetal() {
    moedasMetais.add(new MoedaMetal("010", 0.5, "4", "Dorado", 7.81, 23.00));
    moedasMetais.add(new MoedaMetal("010", 0.25, "5", "Prata", 7.55, 15.6));
    moedasMetais.add(new MoedaMetal("010", 0.05, "6",  "Marrom", 4.10, 22.00));
    // moedasMetais.add(new Cedula("Cad3","End3", 456));
  }

  public void addDadoMoedaMetal(MoedaMetal novo) {
    moedasMetais.add(novo);
  }

  public ArrayList<MoedaMetal> recuperaDadoMoedaMetal() {
    return moedasMetais;
  }

 public void deletarMoedaMetal(String idMoeda) {
    MoedaMetal MoedaMetalExcluir = null;
    for (MoedaMetal moedaMetal : moedasMetais) {
      if (moedaMetal.getIdMoeda().equals(idMoeda)) {
        MoedaMetalExcluir = moedaMetal;
        break;
      }
    }
    if (MoedaMetalExcluir != null) {
      moedasMetais.remove(MoedaMetalExcluir);
      // Colocar na tela: Cedula removido com sucesso: " + MoedaMetalExcluir.getValor()
    } else {
      // Colocar na tela: Cedula não encontrado com o ID: " + id
    }
  }
  
  public void update(MoedaMetal toUpdate) {
        Database db = getConnection();
        ArrayList<MoedaMetal> moedasMetais = db.recuperaDadoMoedaMetal();
        for (int i = 0; i < moedasMetais.size(); i++) {
            MoedaMetal moedaMetal = moedasMetais.get(i);
            if (moedaMetal.getIdMoeda().equals(toUpdate.getIdMoeda())) {
                moedaMetal.setValor(toUpdate.getValor());
                moedaMetal.setPeso(toUpdate.getPeso());
                System.out.println("Moeda Metal atualizada: " + moedaMetal);
                break;
            }
        }
    }

  
}