package questao06;

import java.util.Scanner;

public class FolhaDePagamento {
    private Funcionario[] funcionarios = new Funcionario[10];
    private int quantidadeDeFuncionarios;

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios[quantidadeDeFuncionarios] = funcionario;
        this.quantidadeDeFuncionarios +=1;

    }
    public void mostrarFuncionarios(){
        System.out.println("=====================================================");
        try{
            for ( var k1: funcionarios) {
                System.out.printf("Funcionario: %s\n", k1.getNome());
                System.out.printf("CPF: %s\n", k1.getCpf());
                System.out.printf("Quantidade de Filhos: %s\n",k1.getQuantidadeDeFilhos());
                System.out.printf("Salario: %.2f\n", k1.getSalarioBase() + 100 * (k1.getQuantidadeDeFilhos()));
                System.out.println("=====================================================");
            }

        }catch(NullPointerException e){
            // :D
        }

    }
    public void calcularFolhaDePagamento(){
        System.out.println("=====================================================");
        double salario = 0;
        try{
            for ( var k1: this.funcionarios){
                System.out.printf("Funcinario: %s Salario: %.2f\n",k1.getNome(),k1.getSalario());
                salario += k1.getSalario();
            }
        }catch(NullPointerException e){
            //
        }finally {
            System.out.println("-----------------------------------------------------");
            System.out.printf("Total: %.2f\n", salario);
            System.out.println("=====================================================");
        }
    }

    public void cadastrarFuncionario(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        String nome = scan.nextLine();

        System.out.println("Digite o cpf do funcionario:");
        String cpf = scan.nextLine();

        System.out.println("Digite a quantidade de filhos:");
        int quantFilhos = scan.nextInt();

        System.out.println("Digite o salario base:");
        double salario = scan.nextDouble();

        adicionarFuncionario(new Funcionario(nome,cpf, quantFilhos, salario));

    }
}
