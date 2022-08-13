package questao07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServidorLoja {
    private Scanner scan = new Scanner(System.in);
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Produtos> listaDeProdutos = new ArrayList<>();


    public void init(){
        // menu da loja :D
        while(true){
            System.out.println("=============BEM-VINDO=================");
            System.out.println("ESCOLHA UMA DAS OPCOES ABAIXO:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Escolher Cliente");
            System.out.println("4 - Adicionar Produto na loja");
            System.out.println("5 - Listar Produtos da loja");
            System.out.println("=======================================");
            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    this.addCliente();
                    break;

                case 2:
                    this.listarClientes();
                    break;

                case 3:
                    this.escolherCliente();
                    break;
                case 4:
                    this.addProduto();
                    break;

                case 5:
                    this.listarProdutos();
                    break;
            }

        }
    }

    private void addCliente(){
        System.out.println("Digite o nome do cliente:");
        scan.nextLine(); //so para desbugar o scanner
        String nome = scan.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scan.nextLine();

        System.out.println("Escolha o sexo: 1 - Masculino 2-Feminino 3-Outro");
        int sexo = scan.nextInt();
        SEXO sex;

        switch (sexo){
            case 1:
                sex = SEXO.MASCULINO;
                break;

            case 2:
                sex = SEXO.FEMININO;
                break;

            default:
                sex = SEXO.OUTRO;
                break;

        }

        this.clientes.add(new Cliente(nome, cpf, sex));

    }
    public void addCliente(Cliente pd){
        this.clientes.add(pd);
    }
    public void listarClientes(){
        System.out.println("=============================================");
        for(var k1: this.clientes){
            System.out.printf("Nome: %s\n", k1.getNome());
            System.out.printf("CPF: %s\n", k1.getCpf());
            System.out.printf("Nascimento: %s\n", k1.getNascimento());
            System.out.printf("Sexo: %s\n", k1.getSexo());
            System.out.printf("Compras: %d\n", k1.getCompras().size());
            System.out.println("**");
        }
        System.out.println("=============================================");

    }

    private void escolherCliente() {
        System.out.println("Digite o cpf do cliente:");
        scan.nextLine(); //so para desbugar o scanner
        String cpf = scan.nextLine();
        Cliente cliente = null;
        for(var k1 : clientes){
            if(k1.getCpf().equals(cpf)){
                cliente = k1;
            }
        }
        if(cliente != null){
            System.out.println("============================================");
            System.out.printf("Nome: %s\n", cliente.getNome());
            System.out.printf("CPF: %s\n", cliente.getCpf());
            System.out.printf("nascimento: %s\n", cliente.getNascimento());
            System.out.printf("Sexo: %s\n", cliente.getSexo());
            System.out.printf("Compras: %d\n", cliente.getCompras().size());
            System.out.println("============================================");

        }
    }

    private void addProduto(){
        System.out.println("Digite o nome do produto:");
        scan.nextLine(); //so para desbugar o scanner
        String nome = scan.nextLine();

        System.out.println("Digite o preco:");
        double preco = scan.nextDouble();

        listaDeProdutos.add(new Produtos(nome, preco));

    }

    public void addProduto(Produtos pd){
        this.listaDeProdutos.add(pd);
    }

    private void listarProdutos(){
        System.out.println("============================================");
        for(var k1: listaDeProdutos){
            System.out.printf("Nome: %s\n", k1.getNome());
            System.out.printf("Preco: %s\n", k1.getPreco());
            System.out.printf("Codigo: %s\n", k1.getCode());
            System.out.println("**");

        }
        System.out.println("============================================");
    }
}
