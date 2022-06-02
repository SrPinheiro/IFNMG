import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        /*4. Escreva um programa que receba quatro notas de um aluno e imprima a média das notas. */
        Scanner scan = new Scanner(System.in);
        double notas[] = new double[4];

        for (byte i = 1; i <= 4; i++) {
            System.out.println("-------------------------------------------------");
            System.out.printf("Digite a sua %dº nota:\n", i);
            System.out.println("-------------------------------------------------");
            notas[i-1] = scan.nextDouble();
        }
        
        double total = 0;
        for (var a:notas){
            total += a;
        }
        scan.close();
        System.out.println("-------------------------------------------------");
        System.out.printf("media: %.2f\n", total/notas.length);
        System.out.println("-------------------------------------------------");
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */