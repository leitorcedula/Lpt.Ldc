package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.dao.MoedaMetalDAO;
import br.aluno.ifsp.LDC.model.MoedaMetal;
import jakarta.websocket.server.PathParam;

public class MoedaController {
    @Autowired
    private MoedaMetalDAO moedaDeletada = MoedaMetalDAO.getInstance();

    @DeleteMapping("/ldc/deletamoeda/{idMoeda}")
    public String deletarMoeda(@PathVariable("idMoeda") String idMoeda) {
        MoedaMetal moedaDeletar = moedaDeletada.encontraIdsMoedaMetal(idMoeda);

        if (moedaDeletar != null) {
            moedaDeletada.delete(moedaDeletar);
            return "Moeda excluída!";
        } else {
            return "Id da moeda não encontrado.";
        }

    }

    @PutMapping("/ldc/editamoeda/{idMoeda}")
    public String attMoeda (@PathParam("titulo") String titulo, @RequestBody MoedaMetal novaMoeda){
        MoedaMetalDAO moedaDAO = new MoedaMetalDAO();
        moedaDAO.update(novaMoeda);
        return "essa é a moeda atualizada:" + novaMoeda;
    }


}
