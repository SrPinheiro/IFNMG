package questao04;

public class Retangulo {
    double base;
    double altura;

    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    double area(){
        return this.base * this.altura;
    }
}
