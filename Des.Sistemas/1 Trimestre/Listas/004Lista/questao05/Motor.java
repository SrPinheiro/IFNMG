package questao05;

public class Motor {
    private int quantidadedeCilindros;
    private boolean ligado;

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Carro Desligado!");
    }

    public void acelerar() {
        System.out.println("Acelerando!!");
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