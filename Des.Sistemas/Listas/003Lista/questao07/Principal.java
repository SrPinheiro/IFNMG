package questao07;

public class Principal {

    public static void main(String[] args) {
        Cliente leonardo = new Cliente("Leonardo", "4002-8922", SEXO.MASCULINO);
        Carrinho carro1 = new Carrinho(leonardo);
        Produtos arroz = new Produtos("Arroz", 25);
        SEXO sex;


        carro1.addItem(arroz, 2);
        carro1.mostrarCarrinho();
        carro1.getDono();


        ServidorLoja loja1 = new ServidorLoja();
        loja1.addCliente(leonardo);

        // esse é o menu da loja, so tirar o comentario
        //loja1.init();
    }

}
