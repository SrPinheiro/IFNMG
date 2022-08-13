package questao07;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private Cliente cliente;
    private final List<Produtos> listaDeProdutos = new ArrayList<>();

    Carrinho(Cliente cliente){
        this.cliente = cliente;
    }

    public void addItem(Produtos pd, int quant){
            this.listaDeProdutos.add(pd);
            pd.setQuantidade(quant);
    }
    public void getDono(){
        System.out.printf("Dono: %s\n", cliente.getNome());
    }
    
    public void mostrarCarrinho(){
        System.out.println("--------------Carrinho-------------------");
        for (var o: listaDeProdutos) {
            System.out.printf("%s   %s\n",o.getNome(), o.getQuantidade());
            System.out.println("**");
        }

        System.out.println("-----------------------------------------");
    }

}
