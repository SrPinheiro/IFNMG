package questao01;


import java.util.ArrayList;

public class Caixa {
    private final double LARGURA;
    private final double ALTURA;
    private final double PROFUNDIDADE;
    private double espacoLivre;
    private final String MATERIAL;
    private boolean aberta;

    private final ArrayList<Produto> produtos = new ArrayList<>();

    Caixa(double largura, double altura, double profundidade, String material) {
        this.LARGURA = largura;
        this.ALTURA = altura;
        this.PROFUNDIDADE = profundidade;
        this.MATERIAL = material;
        this.espacoLivre = this.LARGURA * this.ALTURA * this.PROFUNDIDADE;
    }

    public void addItem(Produto item) {
        if (this.isAberta()) {
            if (this.espacoLivre + item.getVolume() >= 0) {
                this.produtos.add(item);
                this.espacoLivre -= item.getVolume();
            } else {
                System.out.println("Sem espaço!");
            }
        } else {
            System.out.println("Caixa Fechada!");
        }


    }

    public void removerItem(String nome) {
        produtos.remove(produtos.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .findFirst().orElse(null));
    }

    public void mostrarProdutos() {
        System.out.println("================================================");
        produtos.stream().forEach(c -> {
            System.out.printf("Produto: %s Volume: %s\n", c.getNome(), c.getVolume());
            System.out.println();
        });
        System.out.println("================================================");
    }

    public void fecharCaixa() {
        this.aberta = false;
        System.out.println("Caixa Fechada!");
    }

    public void abrirCaixa() {
        this.aberta = true;
        System.out.println("Caixa Aberta!");
    }

    public boolean isCheia() {
        return this.espacoLivre == 0;
    }

    public double getLargura() {
        return LARGURA;
    }

    public double getAltura() {
        return ALTURA;
    }

    public double getProfundidade() {
        return PROFUNDIDADE;
    }

    public String getMaterial() {
        return MATERIAL;
    }

    public boolean isAberta() {
        return aberta;
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