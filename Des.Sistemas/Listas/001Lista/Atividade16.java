import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        /*16. Escreva um programa que receba um número e informe se o número é par ou ímpar. */
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite um numero:");
        System.out.println("-------------------------------------------------");
        double numero = scan.nextDouble();

        scan.close();
        if(numero > 0){
            if(numero%2 == 0){
                System.out.println("-------------------------------------------------");
                System.out.printf("O numero: %s é Par\n", numero);
                System.out.println("-------------------------------------------------");
            }else{
                System.out.println("-------------------------------------------------");
                System.out.printf("O numero: %s é Impar\n", numero);
                System.out.println("-------------------------------------------------");
            }
        }else{
            System.out.println("-------------------------------------------------");
            System.out.printf("O numero: %s é Impar\n", numero);
            System.out.println("-------------------------------------------------");
        }
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */