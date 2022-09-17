import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        /*2. Escreva um programa que receba dois números decimais, armazene a soma dos dois em uma
nova variável e em seguida imprima o resultado. */
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite o primeiro numero:");
        System.out.println("-------------------------------------------------");
        double x = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.println("Digite o segundo numero:");
        System.out.println("-------------------------------------------------");
        double y = scan.nextDouble();

        double c = x + y;

        System.out.println("-------------------------------------------------");
        System.out.printf("Resultado: %.2f\n", c);
        System.out.println("-------------------------------------------------");
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */