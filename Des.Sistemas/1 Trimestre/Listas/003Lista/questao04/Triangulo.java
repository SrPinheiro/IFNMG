package questao04;

public class Triangulo {
    double base;
    double altura;

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }

    double area(){
        return this.base * this.altura;
    }
}
