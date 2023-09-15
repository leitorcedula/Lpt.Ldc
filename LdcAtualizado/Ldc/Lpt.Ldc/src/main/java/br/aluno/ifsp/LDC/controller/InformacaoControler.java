package br.aluno.ifsp.LDC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Cedula;

@RestController
public class InformacaoControler{
    CedulaDAO dao = CedulaDAO.getInstance();

    @GetMapping("/api/bd/notas/{id}")
    public Cedula verCedulas(@PathVariable("id") String id) {
        for(int i=0 ; i<dao.read().size() ; i++){
            if(dao.read().get(i).getIdMoeda().equals(id)){
                return dao.read().get(i);
        }
    }
    return null;
}

    @PutMapping("api/bd/informacoes/{id}")
    public Cedula atualizarCedulas(@PathVariable("id") String id, @RequestBody Cedula cedulaBody){
        for(int i=0 ; i<dao.read().size() ; i++){
            if(dao.read().get(i).getIdMoeda().equals(id)){
                dao.read().get(i).setAltura(cedulaBody.getAltura());
                dao.read().get(i).setLargura(cedulaBody.getValor());
                dao.read().get(i).setValor(cedulaBody.getValor());
                return dao.read().get(i);
        }
    }
    return null;
}

}