package questao03;

public class Carro {
    private final String MARCA;
    private final double VELOCIDADEMAX;
    private final double POTENCIA;
    private boolean ligado;
    private double velocidade;

     Carro(String marca, double velocidadeMAX){
         this.MARCA = marca;
         this.VELOCIDADEMAX = velocidadeMAX;
         this.POTENCIA =  this.VELOCIDADEMAX * 0.1;
     }

    public void acelerar(){
         if(this.ligado){
             if(this.velocidade + this.POTENCIA > this.VELOCIDADEMAX){
                 this.velocidade = this.VELOCIDADEMAX;
             }else{
                 this.velocidade += this.POTENCIA;
             }
         }
    }

    public void frear(){
         if(this.velocidade - this.POTENCIA < 0){
             this.velocidade = 0;
         }else{
             this.velocidade -= this.POTENCIA;
         }

    }

    public void girarChave(){
         this.ligado = !this.ligado;
         if(this.ligado){
             System.out.println("Carro Ligado!");
         }else{
             System.out.println("Carro Desligado!");
             this.velocidade = 0;
         }
    }

    public String getMARCA() {
        return MARCA;
    }

    public double getVELOCIDADEMAX() {
        return VELOCIDADEMAX;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getPOTENCIA() {
        return POTENCIA;
    }
}
