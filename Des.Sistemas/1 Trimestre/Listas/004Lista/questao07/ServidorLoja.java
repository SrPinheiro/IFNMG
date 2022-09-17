package questao07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServidorLoja {
    private Scanner scan = new Scanner(System.in);
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Produtos> listaDeProdutos = new ArrayList<>();

    public ServidorLoja() {
        // menu da loja :D
        while (true) {
            try {
                System.out.println("=============BEM-VINDO=================");
                System.out.println("ESCOLHA UMA DAS OPCOES ABAIXO:");
                System.out.println("1 - Adicionar cliente");
                System.out.println("2 - Listar Clientes");
                System.out.println("3 - Vender Produto");
                System.out.println("4 - Adicionar Produto na loja");
                System.out.println("5 - Listar Produtos da loja");
                System.out.println("6 - Informacoes do cliente");
                System.out.println("7 - Ver Compras do cliente");
                System.out.println("8 - Encerrar Programa");
                System.out.println("=======================================");
                int opcao = Integer.parseInt(scan.nextLine());

                switch (opcao) {
                    case 1 -> this.addCliente();
                    case 2 -> this.listarClientes();
                    case 3 -> this.venderProduto();
                    case 4 -> this.addProduto();
                    case 5 -> this.listarProdutos();
                    case 6 -> this.InformacoesDoCliente();
                    case 7 -> this.verificarCompras();
                    case 8 -> System.exit(0);
                }
            }catch (Exception e){
                //apenas para ignorar Erros :D
            }
        }
    }


    private void addCliente() {
        System.out.println("Digite o nome do cliente:");
        String nome = scan.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scan.nextLine();

        System.out.println("Escolha o sexo: 1 - Masculino 2-Feminino 3-Outro");
        int sexo = Integer.parseInt(scan.nextLine());

        SEXO sex = switch (sexo) {
            case 1 -> SEXO.MASCULINO;
            case 2 -> SEXO.FEMININO;
            default -> SEXO.OUTRO;
        };

        this.clientes.add(new Cliente(nome, cpf, sex));

    }

    public void listarClientes() {
        System.out.println("=============================================");
        for (var k1 : this.clientes) {
            System.out.printf("Nome: %s\n", k1.getNome());
            System.out.printf("CPF: %s\n", k1.getCpf());
            System.out.printf("Nascimento: %s\n", k1.getNascimento());
            System.out.printf("Sexo: %s\n", k1.getSexo());
            System.out.println("**");
        }
        System.out.println("=============================================");

    }

    public void verificarCompras(){
        System.out.println("Digite o cpf do cliente:");
        String cpf = scan.nextLine();

        Cliente cliente = clientes.stream()
                .filter(c -> c.getCpf().equalsIgnoreCase(cpf))
                .findFirst()
                .orElse(null);

        if (cliente != null){
            cliente.mostrarCompras();

        }else{
            System.out.println("CPF nao cadastrado!");
        }
    }

    private void venderProduto() {
        System.out.println("Digite o CPF do cliente:");
        String cpf = scan.nextLine();


        Cliente cliente = this.clientes.stream().filter(c -> c.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if (cliente != null){
            Carrinho carrinho = new Carrinho();
            while (true) {

                System.out.println("Digite o codigo do produto:");
                int codeProduto = Integer.parseInt(scan.nextLine());

                if (codeProduto > 0) {
                    Produtos produto = this.listaDeProdutos.stream().filter(c -> c.getCode() == codeProduto).findFirst().orElse(null);
                    if(produto != null){
                        carrinho.addItem(produto);
                        System.out.println("produto adicionado!");
                    }else{
                        System.out.println("Produto invalido!");
                    }
                } else {
                    if (cliente.addCompra(carrinho)){
                        carrinho.mostrarCarrinho();
                    }else{
                        System.out.println("Compra não realizada!");
                    }
                    break;
                }
            }

        }




    }

    private void InformacoesDoCliente() {
        System.out.println("Digite o cpf do cliente:");
        String cpf = scan.nextLine();

        Cliente cliente = clientes.stream().filter(c -> c.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if (cliente != null) {
            System.out.println("============================================");
            System.out.printf("Nome: %s\n", cliente.getNome());
            System.out.printf("CPF: %s\n", cliente.getCpf());
            System.out.printf("nascimento: %s\n", cliente.getNascimento());
            System.out.printf("Sexo: %s\n", cliente.getSexo());
            System.out.println("============================================");

        }
    }

    private void addProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scan.nextLine();

        System.out.println("Digite o preco:");
        double preco = Double.parseDouble(scan.nextLine());
        Produtos p1 = new Produtos(nome, preco);

        listaDeProdutos.add(p1);
        System.out.printf("Codigo: %s\n", p1.getCode());

    }

    private void listarProdutos() {
        System.out.println("============================================");
        for (var k1 : listaDeProdutos) {
            System.out.printf("Nome: %s\n", k1.getNome());
            System.out.printf("Preco: %s\n", k1.getPreco());
            System.out.printf("Codigo: %s\n", k1.getCode());
            System.out.println("**");

        }
        System.out.println("============================================");
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