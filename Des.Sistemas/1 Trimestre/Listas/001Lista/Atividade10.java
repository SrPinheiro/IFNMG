import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        /*10. Faça um programa que receba uma quantidade de minutos e imprima o equivalente em horas. */
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite a quantidade de minutos:");
        System.out.println("-------------------------------------------------");
        double minutos = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.printf("Tempo: %.0fh %.0fm\n", minutos/60, (minutos%60));
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