public class Carro {
    String cor;
    String marca;
    int kmRodados;
    double litrosCombustivel;
    private int potencia;
    private int velocidade;
    int velocidadeMax;
    private boolean ar;


    // essa parte de baixo você pode ignorar ^^
    Carro(String cor, String marca, int potencia){
        this.cor = cor;
        this.marca = marca;
        this.potencia = potencia;
        this.velocidadeMax = 10 * potencia;

    }
    void acelerar() {
        if(this.litrosCombustivel > 0) {
            if (this.velocidade + this.potencia > velocidadeMax) {
                this.velocidade = velocidadeMax;
            } else {
                this.velocidade += this.potencia;
            }
        }
    }
    void frear(){
        if(velocidade - this.potencia < 0){
            this.velocidade = 0;
        }else{
            this.velocidade -= this.potencia;
        }
    }
    void ArCondicionado(){
        this.ar = !this.ar;
    }

}
