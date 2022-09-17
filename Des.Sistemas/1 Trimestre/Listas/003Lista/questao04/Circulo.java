package questao04;

public class Circulo {
    double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    double area(){
        return Math.PI * Math.pow(this.raio, 2);
    }

}
