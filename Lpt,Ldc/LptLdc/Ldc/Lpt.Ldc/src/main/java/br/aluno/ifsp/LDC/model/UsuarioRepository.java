package br.aluno.ifsp.LDC.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.aluno.ifsp.LDC.model.Usuario;
import br.aluno.ifsp.LDC.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/adicionarUsuario")
    public void adicionarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
}


public class Usuario {
    private String idUsuario;
    private String dataNasc;
    private String email;
    private String senha;
    private String nomeUsuario;
    private String localizacao;
    private String deficiencia;

    
    public Usuario(String idUsuario, String dataNasc, String email, String senha, String nomeUsuario, String localizacao, String deficiencia) {
        this.idUsuario = idUsuario;
        this.dataNasc = dataNasc;
        this.email = email;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
        this.localizacao = localizacao;
        this.deficiencia = deficiencia;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", dataNasc=" + dataNasc + ", email=" + email + ", senha=" + senha
                + ", nomeUsuario=" + nomeUsuario + ", localizacao=" + localizacao + ", deficiencia=" + deficiencia
                + "]";
    }  
}


