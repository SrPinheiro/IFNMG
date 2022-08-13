package questao07;

public class Produtos {
    private String nome;
    private int quantidade;
    private int code;
    private double preco;

    Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.code = (int) (10000000000000L + Math.random() * 999999999999999999L);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCode() {
        return code;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
