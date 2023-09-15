package br.aluno.ifsp.LDC.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class CedulaController {
    CedulaDAO dao = CedulaDAO.getInstance();
    @PostMapping("/api/bd/notas")
    public Cedula criarUser(@RequestBody Cedula cedulaBody) {
       Cedula cedula = new Cedula(cedulaBody.getIdPais(), cedulaBody.getValor(), cedulaBody.getIdMoeda(), cedulaBody.getLargura(), cedulaBody.getAltura());
       dao.create(cedula);
       return cedula;
    }

}