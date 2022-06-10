package lista02;

/*3. Construa um programa que solicite infinitos números inteiros ao usuário, e ao informar o valor
“0”, o programa imprima quantos números pares foram digitados.*/

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num, pares = 0;
        
        while(true){
            System.out.println("---------------------------------------------------");
            System.out.println("Digite um numero: (0 - Mostar Pares)");
            System.out.println("---------------------------------------------------");
            num = scan.nextInt();
            if(num == 0){
                System.out.println("---------------------------------------------------");
                System.out.printf("Total de pares: %d\n", pares);
                System.out.println("---------------------------------------------------");
                
            }else if(num % 2 == 0){
                pares ++;
                System.out.println("---------------------------------------------------");
                System.out.println("Numero PAR!");
                System.out.println("---------------------------------------------------");
            }
        }
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */
