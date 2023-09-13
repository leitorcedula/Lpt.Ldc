package br.aluno.ifsp.LDC.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Moeda;
import br.aluno.ifsp.LDC.service.MoedaService;

@RestController
@RequestMapping("/moeda")
public class MoedaController {

    private final MoedaService moedaService;

    @Autowired
    public MoedaController(MoedaService moedaService) {
        this.moedaService = moedaService;
    }

    @GetMapping("/adicionar")
    public String exibirFormularioAdicao() {
        return "adicionar-moeda";
    }

    @PostMapping("/adicionar")
    public String adicionarMoeda(
            @RequestParam("valor") double valor,
            @RequestParam("idMoeda") String idMoeda,
            @RequestParam("cor") String cor,
            @RequestParam("diametro") double diametro,
            Model model
    ) {
        Moeda novaMoeda = new Moeda(valor, idMoeda, cor, diametro);
        moedaService.adicionarMoeda(novaMoeda);
        model.addAttribute("mensagem", "Moeda adicionada com sucesso!");
        return "adicionar-moeda";
    }

    @PutMapping("/atualizar")
    public String atualizarMoeda(
            @RequestParam("id") String idMoeda,
            @RequestParam("valor") double novoValor,
            @RequestParam("cor") String novaCor,
            @RequestParam("diametro") double novoDiametro,
            Model model
    ) {
        Moeda moedaExistente = moedaService.buscarMoedaPorId(idMoeda);

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

    @DeleteMapping("/deletar")
    public String deletarMoedaPorId(@RequestParam("id") String idMoeda, Model model) {
        boolean moedaDeletada = moedaService.deletarMoedaPorId(idMoeda);

        if (moedaDeletada) {
            model.addAttribute("mensagem", "Moeda deletada com sucesso!");
        } else {
            model.addAttribute("mensagem", "Moeda não encontrada.");
        }

        return "deletar-moeda";
    }
}
