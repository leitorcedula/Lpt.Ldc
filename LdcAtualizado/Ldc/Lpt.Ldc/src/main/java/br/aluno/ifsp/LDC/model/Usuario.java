package br.aluno.ifsp.LDC.model;

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



    // public boolean verificarCredenciais(String email, String senha) {
    //     UsuarioDAO usuarioDAO = new UsuarioDAO(); // Instancie o UsuarioDAO

    //     // Busque o usuário no banco de dados pelo email
    //     Usuario usuario = usuarioDAO.buscaUsuarioPorEmail(email);

    //     // Verifique se o usuário foi encontrado e se a senha fornecida é válida
    //     if (usuario != null && usuario.getSenha().equals(senha)) {
    //         return true; // Credenciais válidas
    //     } else {
    //         return false; // Credenciais inválidas
    //     }
    // }

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", dataNasc=" + dataNasc + ", email=" + email + ", senha=" + senha
                + ", nomeUsuario=" + nomeUsuario + ", localizacao=" + localizacao + ", deficiencia=" + deficiencia
                + "]";
    }


    
}


