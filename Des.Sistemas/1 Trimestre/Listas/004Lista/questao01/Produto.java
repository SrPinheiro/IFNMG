package questao01;

public class Produto {
    private String nome;
    private double volume;

    Produto(String nome, double volume) {
        this.nome = nome;
        if (volume > 0) {
            this.volume = volume;
        } else {
            throw new RuntimeException("Volume invalido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getVolume() {
        return volume;
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