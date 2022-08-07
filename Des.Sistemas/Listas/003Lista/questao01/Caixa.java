package questao01;


import java.util.ArrayList;

public class Caixa {
    private final double LARGURA;
    private final double ALTURA;
    private final double PROFUNDIDADE;
    private double espacoLivre;
    private final String MATERIAL;

    private boolean aberta;

    private ArrayList<Produto> produtos = new ArrayList<>();

    Caixa(double largura, double altura, double profundidade, String material){
        this.LARGURA = largura;
        this.ALTURA = altura;
        this.PROFUNDIDADE = profundidade;
        this.MATERIAL = material;
        this.espacoLivre = this.LARGURA * this.ALTURA * this.PROFUNDIDADE;
        this.aberta = false;
    }

    public void addItem(Produto item){
        if(this.espacoLivre > 0 && this.espacoLivre + item.volume >= 0){
            this.produtos.add(item);
            this.espacoLivre -= item.volume;
        }

    }
    public void mostrarProdutos(){
        System.out.println("================================================");
        for(var k1: this.produtos){
            System.out.printf("Produto: %s Volume: %s\n", k1.nome,k1.volume);
        }
        System.out.println("================================================");
    }

    public void fecharCaixa(){
        this.aberta = false;
        System.out.println("Caixa Fechada!");
    }

    public void abrirCaixa(){
        this.aberta = true;
        System.out.println("Caixa Aberta!");
    }

    public boolean isCheia(){
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
