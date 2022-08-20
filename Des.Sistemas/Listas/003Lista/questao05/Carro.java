package questao05;

public class Carro {
    private String modelo;
    private String cor;
    private String Placa;
    private int numeroDePortas;
    private Motor motor;

    public void ligar() {
        motor.ligar();
    }

    public void desligar() {
        motor.desligar();
    }

    public void acelerar() {
        motor.acelerar();
    }
}
/*
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA — JetBrains
 * Turma: Info 0121
 * IFNMG — Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 * Data:
 */