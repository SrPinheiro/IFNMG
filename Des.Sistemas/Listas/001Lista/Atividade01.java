import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
        /*1. Escreva um programa que receba dois inteiros e imprima a soma dos dois valores. */
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite o primeiro numero:");
        System.out.println("-------------------------------------------------");
        double x = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.println("Digite o segundo numero:");
        System.out.println("-------------------------------------------------");
        double y = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.printf("Soma: %d", x+y);
        System.out.println("-------------------------------------------------");
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */