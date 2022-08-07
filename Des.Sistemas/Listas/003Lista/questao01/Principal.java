package questao01;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Miojo",120);
        Produto produto2 = new Produto("Missil v2",140);
        Produto produto3 = new Produto("Herobrine",8490);
        Caixa caixa1 = new Caixa(25,35,10, "GarrafaPet");



        caixa1.fecharCaixa();
        caixa1.abrirCaixa();

        caixa1.addItem(produto1);
        System.out.printf("Caixa cheia: %s\n",caixa1.isCheia());

        caixa1.addItem(produto2);
        System.out.printf("Caixa cheia: %s\n",caixa1.isCheia());

        caixa1.addItem(produto3);
        System.out.printf("Caixa cheia: %s\n",caixa1.isCheia());

        caixa1.mostrarProdutos();
    }
}
