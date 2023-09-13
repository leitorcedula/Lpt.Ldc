package br.aluno.ifsp.LDC.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import br.aluno.ifsp.LDC.dao.MoedaMetalDAO;
import br.aluno.ifsp.LDC.model.MoedaMetal;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;

import br.aluno.ifsp.LDC.service.MoedaService;

@RestController
public class MoedaController {
    private final MoedaService moedaService;

    @Autowired
    public MoedaController(MoedaService moedaService) {
        this.moedaService = moedaService;
    }
    
    @Autowired
    private MoedaMetalDAO moedaDeletada = MoedaMetalDAO.getInstance();
    
    @PostMapping("/ldc/criaMoeda")
    public String CriarMoeda(@RequestBody MoedaMetal novaMoeda){
        MoedaMetalDAO moedaMetalDAO = MoedaMetalDAO.getInstance();
        return "Moeda criada com sucesso!";
    }

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

    @PutMapping("/atualizar")
    public String atualizarMoeda(
            @RequestParam("id") String idMoeda,
            @RequestParam("valor") double novoValor,
            @RequestParam("cor") String novaCor,
            @RequestParam("diametro") double novoDiametro,
            Model model
    ) {
        
        MoedaMetal moedaExistente = moedaService.buscarMoedaPorId(idMoeda);

        if (moedaExistente != null) {
            moedaExistente.setValor(novoValor);
            moedaExistente.setCor(novaCor);
            moedaExistente.setDiametro(novoDiametro);

            moedaService.atualizarMoeda(moedaExistente);
            model.addAttribute("mensagem", "Moeda atualizada com sucesso!");
        } else {
            model.addAttribute("mensagem", "Moeda não encontrada.");
        }

        return "atualizar-moeda";
    }

    @PutMapping("/ldc/editamoeda/{idMoeda}")
    public String attMoeda (@PathParam("idMoeda") String idMoeda, @RequestBody MoedaMetal novaMoeda){
        MoedaMetalDAO moedaDAO = new MoedaMetalDAO();
        moedaDAO.update(novaMoeda);
        return "essa é a moeda atualizada:" + novaMoeda;
    }


}
