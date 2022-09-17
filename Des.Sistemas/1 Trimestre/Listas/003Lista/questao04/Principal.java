package questao04;

public class Principal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(12);
        Losango l1 = new Losango(32,9);
        Quadrado q1 = new Quadrado(9);
        Retangulo r1 = new Retangulo(23,8);
        Triangulo t1 = new Triangulo(23,4);


        System.out.println(c1.area());
        System.out.println(l1.area());
        System.out.println(q1.area());
        System.out.println(r1.area());
        System.out.println(t1.area());

    }
}
