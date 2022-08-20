package questao08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Servidor {
    private Scanner scan = new Scanner(System.in);
    private List<Cliente> clientes = new ArrayList<>();

    Servidor() {
        this.clientes.add(new Cliente("Leonardo", "123", true)); // clientes padrao
        this.clientes.add(new Cliente("Larissa", "321", true));

        this.clientes.get(0).getConta().depositar(100);
        this.clientes.get(1).getConta().depositar(200);
    }

    public void menu() {
        while (true) {
            System.out.println("=================Bem-Vindo==============================");
            System.out.println("0 - Cadastrar Cliente");
            System.out.println("1 - listarContas/Clientes");
            System.out.println("2 - fazer transferencias");
            System.out.println("3 - fazer um deposito");
            System.out.println("4 - fazer um saque");
            System.out.println("========================================================");
            byte opcao = Byte.parseByte(scan.nextLine());

            switch (opcao) {
                case 0 -> this.cadstrarCliente();
                case 1 -> this.listarContas();
                case 2 -> this.transferencia();
                case 3 -> this.depositar();
                case 4 -> this.sacar();
            }
        }

    }

    private void sacar() {
        System.out.println("Digite o seu cpf:");
        String cpf = scan.nextLine();

        System.out.println("Digite o valor a ser sacado:");
        double valor = Double.parseDouble(scan.nextLine());

        Cliente conta = encontrar(cpf);

        if (conta != null) {
            if (conta.getConta().sacar(valor)) {
                System.out.println("Valor sacado!");
                return;
            }
        }

        System.out.println("Algo deu errado, tente novamente!");

    }

    private void depositar() {
        System.out.println("Digite o seu cpf:");
        String cpf = scan.nextLine();

        System.out.println("Digite o valor a ser depositado:");
        double valor = Double.parseDouble(scan.nextLine());

        Cliente cliente = encontrar(cpf);

        if (cliente != null) {
            if (cliente.getConta().depositar(valor)) {
                System.out.println("Valor depositado!");
                return;
            }
        }

        System.out.println("Algo deu errado, tente novamente!");

    }


    private void cadstrarCliente() {
        System.out.println("Digite o nome do Cliente");
        String nome = scan.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpf = scan.nextLine();

        System.out.println("o cliente é um aluno? (true ou false)");
        boolean aluno = Boolean.parseBoolean(scan.nextLine());

        clientes.add(new Cliente(nome, cpf, aluno));

    }

    private void listarContas() {
        System.out.println("======================================================");
        for (var k1 : clientes) {
            System.out.printf("Cliente: %s, Conta: %s R$: %s\n", k1.getNome(), k1.getConta(), k1.getConta().getSaldo());
            System.out.println("**");
        }
        System.out.println("======================================================");
    }

    private void transferencia() {
        System.out.println("Digite o numero seu cpf:");
        String cpf = scan.nextLine();

        System.out.println("Digite o cpf do destino:");
        String cpf2 = scan.nextLine();

        System.out.println("Digite o valor a ser transferido");
        double valor = Double.parseDouble(scan.nextLine());

        Cliente principal = this.encontrar(cpf);
        Cliente destino = this.encontrar(cpf2);

        if (principal != null && destino != null) {
            if (principal.getConta().transferir(destino.getConta(), valor)) {
                System.out.println("valor Transferido");
                return;
            }
        }
        System.out.println("Voce digitou algum valor errado, tente novamente!");
    }

    private Cliente encontrar(String cpf) {
        return this.clientes.stream().filter(c-> c.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
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