/*4. Construa um programa que exiba um menu com 4 opções: 1 - Somar, 2 – Subtrair,
3- Multiplicar e 4 – Dividir e 5 - Sair. Ao escolher uma das opções entre 1 e 4 o
programa deve solicitar que o usuário informe dois números, calcular a operação
escolhida e imprimir o resultado e apresentar o menu novamente. Ao selecionar a
opção 5 o programa deve ser finalizado.*/
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        externo: while(true) {
            System.out.println(linha(70));
            System.out.println("Digite a opcao desejada:");
            System.out.println("1 - Somar, 2 – Subtrair, 3-Multiplicar, 4 – Dividir e 5 - Sair.");
            System.out.println(linha(70));
            byte calculadora = scan.nextByte();

            switch (calculadora) {
                case 5:
                    System.out.println(linha(45));
                    System.out.println("Programa finalizado!");
                    System.out.println(linha(45));
                    break externo;
                case 1: case 2: case 3: case 4:
                    iniciarCalculadora(calculadora);
                    break;
                default:
                    System.out.println(linha(60));
                    System.out.println("ALGO DE ERRADO, Digite apenas as opcoes disponiveis!");
                    System.out.println(linha(60));
            }
        }

    }

    static void iniciarCalculadora(int formula){
        try {
            Scanner scan = new Scanner(System.in);
            double resultado = 0;
            double[] numeros = new double[2];
            String texto = "";

            System.out.printf("%s!CALCULADORA!%s\n", linha(22), linha(21));

            for (byte x = 0; x < 2; x++) {
                System.out.printf("Digite o %sº numero:\n", x + 1);
                System.out.println(linha(50));
                numeros[x] = scan.nextDouble();
            }


            switch (formula) {
                case 1:
                    texto = "Soma: ";
                    resultado = numeros[0] + numeros[1];
                    break;
                case 2:
                    texto = "Subtracao: ";
                    resultado = numeros[0] - numeros[1];
                    break;
                case 3:
                    texto = "Multiplicacao: ";
                    resultado = numeros[0] * numeros[1];
                    break;
                case 4:
                    texto = "Divisao: ";
                    resultado = numeros[0] / numeros[1];
                    break;
            }

            System.out.println(linha(45));
            System.out.printf("%s %.2f\n", texto, resultado);
            System.out.println(linha(45));

        }catch (Exception e){
            System.out.println(linha(45));
            System.out.printf("Erro codigo: %s \n", e.getClass().getSimpleName());
            System.out.println("Digite apenas numeros!");
            System.out.println(linha(45));

        }

    }
    
    static StringBuilder linha(int a){
        StringBuilder linhas = new StringBuilder();
        for(short i = 0; i < a; i++){
            linhas.append("-");
        }
        return linhas;
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA - JetBrains
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */