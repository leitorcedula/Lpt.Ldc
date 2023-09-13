package br.aluno.ifsp.LDC.database;

import java.util.ArrayList;


import br.aluno.ifsp.LDC.model.Cedula;
import br.aluno.ifsp.LDC.model.Usuario;



import br.aluno.ifsp.LDC.model.Moeda;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!
// Exemplo do professor sobre BDD

public class Database {
  private ArrayList<Cedula> cedulas;
  private ArrayList<Moeda> moedas;
  private ArrayList<Usuario> usuarios;
 

  

  
  public Database() {
        cedulas = new ArrayList<>();
        usuarios = new ArrayList<>();
        
        
        
        moedas = new ArrayList<>();
    }

//   public void initCedula() {
//     cedulas.add(new Cedula( null, 10.0, "1", 87.75, 13.5));
//     cedulas.add(new Cedula( null, 20.0, "2", 10, 5));
//     // cedulas.add(new Cedula("Cad3","End3", 456));
//   }

//   public void addDadoCedula(Cedula novo) {
//     cedulas.add(novo);
//   }

//   public ArrayList<Cedula> recuperaDadoCedula() {
//     return cedulas;
//   }

//   public void deletarCedula(String idMoeda) {
//     Cedula cedulaExcluir = null;
//     for (Cedula cedula : cedulas) {
//       if (cedula.getIdMoeda().equals(idMoeda)) {
//         cedulaExcluir = cedula;
//         break;
//       }
//     }
//     if (cedulaExcluir != null) {
//       cedulas.remove(cedulaExcluir);
//       // Colocar na tela: Cedula removido com sucesso: " + cedulaExcluir.getValor()
//     } else {
//       // Colocar na tela: Cedula não encontrado com o ID: " + id
//     }
//   }

//   // É void mesmo?

//   public void update(Cedula toUpdate) {
//     Database db = getConnection();
//     ArrayList<Cedula> cedulas = db.recuperaDadoCedula();
//     for (int i = 0; i < cedulas.size(); i++) {
//         Cedula cedula = cedulas.get(i);
//         if (cedula.getIdMoeda().equals(toUpdate.getIdMoeda())) {
           
//             cedula.setValor(toUpdate.getValor());
//             cedula.setLargura(toUpdate.getLargura());
//             cedula.setAltura(toUpdate.getAltura());
//             break;
//         }
//     }
// }
  

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

  


  

  public void initMoeda() {
    moedas.add(new Moeda(0.5, "4", "Dorado", 7.81));
    moedas.add(new Moeda(0.25, "5", "Prata", 7.55));
    moedas.add(new Moeda(0.05, "6",  "Marrom", 4.10));
    // moedas.add(new Cedula("Cad3","End3", 456));
  }

  public void addDadoMoeda(Moeda novo) {
    moedas.add(novo);
  }

  public ArrayList<Moeda> recuperaDadoMoeda() {
    return moedas;
  }

 public void deletarMoeda(String idMoeda) {
    Moeda MoedaExcluir = null;
    for (Moeda moeda : moedas) {
      if (moeda.getIdMoeda().equals(idMoeda)) {
        MoedaExcluir = moeda;
        break;
      }
    }
    if (MoedaExcluir != null) {
      moedas.remove(MoedaExcluir);
      // Colocar na tela: Cedula removido com sucesso: " + MoedaExcluir.getValor()
    } else {
      // Colocar na tela: Cedula não encontrado com o ID: " + id
    }
  }
  
  public void update(Moeda toUpdate) {
        Database db = getConnection();
        ArrayList<Moeda> moedas = db.recuperaDadoMoeda();
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            if (moeda.getIdMoeda().equals(toUpdate.getIdMoeda())) {
                moeda.setValor(toUpdate.getValor());
              
                System.out.println("Moeda  atualizada: " + moeda);
                break;
            }
        }
    }

  
}