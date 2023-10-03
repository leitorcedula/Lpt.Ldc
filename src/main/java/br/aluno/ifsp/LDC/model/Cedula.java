package  br.aluno.ifsp.LDC.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cedula {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCedula;

    private double valor;
    private double largura;
    private double altura;

    public Cedula(){
        System.out.println("Feito");
    }
    
    public Cedula(  double largura, double altura) {        
    
        this.largura = largura;
        this.altura = altura;
    }

    

    public Long getIdCedula() {
        return idCedula;
    }



    public void setIdCedula(Long idCedula) {
        this.idCedula = idCedula;
    }



    public double getValor() {
        return valor;
    }



    public void setValor(double valor) {
        this.valor = valor;
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

    



//     @Override
//     public String toString() {
//     return "Cedula [valor=" + getValor() + ", idMoeda=" + getIdMoeda() + ", largura=" + largura + ", altura=" + altura + "]";
// }



    // @Override
    // void verificarAutenticidade() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'verificarAutenticidade'");
    // }



}