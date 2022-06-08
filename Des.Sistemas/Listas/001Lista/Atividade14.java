import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        /*14. Escreva um programa que receba dois inteiros e informe qual o maior deles. */
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[2];

        for(byte i = 0; i < 2; i++) {
            System.out.println("-------------------------------------------------");
            System.out.printf("Digite o %sº numero:\n", i+1);
            System.out.println("-------------------------------------------------");
            numeros[i] = scan.nextInt();
        }
        scan.close();
        
        if(numeros[0] > numeros[1]){
            System.out.println("-------------------------------------------------");
            System.out.printf("Maior: %s\n", numeros[0]);
            System.out.printf("Menor: %s\n", numeros[1]);
            System.out.println("-------------------------------------------------");
        }else if(numeros[0] < numeros[1]){
            System.out.println("-------------------------------------------------");
            System.out.printf("Maior: %s\n", numeros[1]);
            System.out.printf("Menor: %s\n", numeros[0]);
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("Os numeros sao iguais!");
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