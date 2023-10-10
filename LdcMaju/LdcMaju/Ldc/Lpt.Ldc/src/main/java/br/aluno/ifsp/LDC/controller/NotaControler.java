package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class NotaControler {

    @GetMapping("/api/bd/notas")
    public ArrayList<Cedula> endPoint1() {
        CedulaDAO dao = CedulaDAO.getInstance();
        return dao.read();
    }

    @PostMapping("/adicionarNota/")
    public String postNota(@RequestBody int idDaNota) {
        return "Nota adicionada ao histórico: ";
    }

    @GetMapping("/historicoNotas")
    public String getHistorico() {
        return "Histórico de notas lida:\n";
    }

    // Nota nota1 = new Nota(10.0);
    // historicoNotas.add(nota1);

    // Nota nota2 = new Nota(20.0);
    // historicoNotas.add(nota2);

    // System.out.println("Histórico de Notas Lidas:");
    // for (Nota nota : historicoNotas) {
    //     System.out.println("Valor da nota: " + nota.ge);
    
    //     public double getValor() {
    //         return valor;
    //     }
    // }
}
