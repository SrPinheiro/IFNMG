package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        gerarFolhaDePagamento();

    }

    public static void gerarFolhaDePagamento() throws InterruptedException {
        final FolhaDePagamento FOLHA = new FolhaDePagamento();
        Scanner scan = new Scanner(System.in);

        limparTela();

        while (true) {
            System.out.println("===========================MENU===============================");
            System.out.println("1- Cadastrar Funcionario");
            System.out.println("2- Mostrar Funcionarios");
            System.out.println("3- Editar Funcionarios");
            System.out.println("4- Calcular Folha De Pagamento");
            System.out.println("5- Encerar Programa!");
            System.out.println("==============================================================");

            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1 -> {
                    try {
                        limparTela();
                        System.out.println("Digite o nome:");
                        String nome = scan.nextLine();

                        limparTela();
                        System.out.println("Digite o CPF:");
                        String cpf = scan.nextLine();

                        limparTela();
                        System.out.println("Digite o salario:");
                        double salario = Double.parseDouble(scan.nextLine());

                        limparTela();
                        System.out.println("Digite a quantidade de filhos:");
                        int filhos = Integer.parseInt(scan.nextLine());

                        FOLHA.adicionarFuncionario(new Funcionario(nome, cpf, filhos, salario));

                    } catch (Exception e) {
                        limparTela();
                        System.out.println("---------------------------");
                        System.out.println("Informacoes incoerentes!");
                        System.out.println("---------------------------");
                        Thread.sleep(5000);
                    }
                }

                case 2 -> FOLHA.mostrarFuncionarios();

                case 3 -> {
                    limparTela();
                    System.out.println("Digite o CPF:");
                    String cpf = scan.nextLine();

                    limparTela();
                    System.out.println("============Editando Funcionario=============");
                    System.out.println("Digite o nome do Funcionario:");
                    String nome = scan.nextLine();

                    limparTela();
                    System.out.println("Digite o salario:");
                    double salario = Double.parseDouble(scan.nextLine());

                    limparTela();
                    System.out.println("Digite a quantidade de filhos:");
                    int filhos = Integer.parseInt(scan.nextLine());

                    limparTela();
                    if (!FOLHA.editarFuncionario(cpf, nome, salario, filhos)) {
                        System.out.println("-----------------");
                        System.out.println("CPF INVALIDO!");
                        System.out.println("-----------------");
                        Thread.sleep(5000);
                    }


                }

                case 4 -> {
                    limparTela();
                    FOLHA.calcularFolhaDePagamento();
                    Thread.sleep(5000);
                }

                case 5 -> System.exit(0);
            }
        }


    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
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