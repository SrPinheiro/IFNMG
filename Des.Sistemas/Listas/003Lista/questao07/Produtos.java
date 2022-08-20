package questao07;

public class Produtos {
    private String nome;
    private int code;
    private double preco;

    Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.code = (int) (10L + Math.random() * 99L);
    }

    public String getNome() {
        return nome;
    }

    public int getCode() {
        return code;
    }

    public double getPreco() {
        return preco;
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