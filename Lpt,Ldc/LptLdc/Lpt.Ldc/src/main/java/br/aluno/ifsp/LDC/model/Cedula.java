package  br.aluno.ifsp.LDC.model;

public class Cedula  extends MoedaAbstrata{
    
    
    private double largura;
    private double altura;

    public Cedula(String idPais, double valor,  String idMoeda ,
            double largura, double altura) {
        super(valor, idMoeda);
       
       
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