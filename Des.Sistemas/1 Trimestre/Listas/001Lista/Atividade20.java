import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        /*20. Escreva um programa que receba três inteiros e informe qual o menor deles. */
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[3];
        for(byte i = 0; i <3; i++){
            System.out.println("-------------------------------------------------");
            System.out.printf("Digite o %sº numero:\n", i+1);
            System.out.println("-------------------------------------------------");
            numeros[i] = scan.nextInt();
        }
        scan.close();
        if(numeros[0] < numeros[1] && numeros[0] < numeros[2]){
            System.out.println("-------------------------------------------------");
            System.out.printf("Menor numero: %s\n", numeros[0]);
            System.out.println("-------------------------------------------------");

        }else if(numeros[1] < numeros[0] && numeros[1] < numeros[2]){
            System.out.println("-------------------------------------------------");
            System.out.printf("Menor numero: %s\n", numeros[1]);
            System.out.println("-------------------------------------------------");

        }else{
            System.out.println("-------------------------------------------------");
            System.out.printf("Menor numero: %s\n", numeros[2]);
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
