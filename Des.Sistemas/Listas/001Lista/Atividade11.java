import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        /*11. Faça um programa que receba uma quantidade de horas e imprima o equivalente em segundos. */
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite a quantidade de Horas:");
        System.out.println("-------------------------------------------------");
        double horas = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.printf("Tempo: %.0fs\n", horas*60*60);
        System.out.println("-------------------------------------------------");
        scan.close();
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */