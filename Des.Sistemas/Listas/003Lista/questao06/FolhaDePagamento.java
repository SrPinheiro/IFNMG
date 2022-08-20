package questao06;

import java.util.Arrays;

public class FolhaDePagamento {
    private final Funcionario[] funcionarios = new Funcionario[20];
    private int quantidadeDeFuncionarios;

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios[quantidadeDeFuncionarios] = funcionario;
        this.quantidadeDeFuncionarios += 1;

    }

    public void mostrarFuncionarios() {
        System.out.println("=====================================================");

        Arrays.stream(funcionarios).forEach(k1 -> {
            System.out.printf("Funcionario: %s\n", k1.getNome());
            System.out.printf("CPF: %s\n", k1.getCpf());
            System.out.printf("Quantidade de Filhos: %s\n", k1.getQuantidadeDeFilhos());
            System.out.printf("Salario: %.2f\n", k1.getSalarioBase() + 100 * (k1.getQuantidadeDeFilhos()));
            System.out.println("");
        });

        System.out.println("=====================================================");

    }

    public void calcularFolhaDePagamento() {
        System.out.println("===================Folha-De-Pagamento================");
        double salario = 0;

        try {
            for (var k1 : this.funcionarios) {
                System.out.printf("Funcinario: %s Salario: %.2f\n", k1.getNome(), k1.getSalario());
                salario += k1.getSalario();
            }
        } catch (NullPointerException e) {
            //
        } finally {
            System.out.println("-----------------------------------------------------");
            System.out.printf("Total: %.2f\n", salario);
            System.out.println("=====================================================");
        }
    }

    public boolean editarFuncionario(String cpf, String nome, double salario, int filhos) {
        Funcionario funcionario = Arrays.stream(funcionarios).filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);

        if (funcionario != null) {
            funcionario.setNome(nome);
            funcionario.setSalarioBase(salario);
            funcionario.setQuantidadeDeFilhos(filhos);
            return true;
        }
        return false;
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