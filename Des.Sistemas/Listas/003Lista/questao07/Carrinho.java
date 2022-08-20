package questao07;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private final List<Produtos> listaDeProdutos = new ArrayList<>();

    public void addItem(Produtos pd) {
        this.listaDeProdutos.add(pd);
    }

    public void mostrarCarrinho() {
        double total = 0;
        System.out.println("--------------Carrinho-------------------");
        for (var p : listaDeProdutos) {
            System.out.printf("Nome: %s\n", p.getNome());
            System.out.printf("preco: %s\n",p.getPreco());
            System.out.println("**");
            total += p.getPreco();
        }

        System.out.println("-----------------------------------------");
        System.out.printf("Total: %.2f\n", total);
        System.out.println("-----------------------------------------");
    }

    public int getQuantidadeProdutos(){
        return this.listaDeProdutos.size();
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