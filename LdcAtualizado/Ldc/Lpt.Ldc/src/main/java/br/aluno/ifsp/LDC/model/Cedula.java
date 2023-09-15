package  br.aluno.ifsp.LDC.model;

public class Cedula extends MoedaAbstrata{
    private double largura;
    private double altura;
    private String idPais;

    public Cedula(String idPais, double valor,  String idMoeda , double largura, double altura) {
        super(valor, idMoeda);
        this.idPais = idPais;
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
    return "Cedula [valor=" + getValor() + ", idMoeda=" + getIdMoeda() + ", largura=" + largura + ", altura=" + altura + "]";
}

    @Override
    void verificarAutenticidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarAutenticidade'");
    }



}