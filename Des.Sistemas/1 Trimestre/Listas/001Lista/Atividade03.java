import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {
        /*3. Escreva um programa que receba dois números inteiros e imprima o resultado da
divisão inteira entre os números bem como o resto dessa divisão. */
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Digite o primeiro numero:");
        System.out.println("-------------------------------------------------");
        double a = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.println("Digite o segundo numero:");
        System.out.println("-------------------------------------------------");
        double b = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.printf("Divisão: %s\nResto: %s\n", (float)a/b, (float)a%b);
        System.out.println("-------------------------------------------------");
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */