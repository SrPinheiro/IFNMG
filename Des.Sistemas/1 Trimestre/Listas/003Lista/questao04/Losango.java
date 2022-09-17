package questao04;

public class Losango {
    double altura;
    double largura;

    Losango(double altura, double largura){
        this.largura = largura;
        this.altura = altura;
    }

    double area(){
        return this.altura * this.largura / 2;
    }
}
