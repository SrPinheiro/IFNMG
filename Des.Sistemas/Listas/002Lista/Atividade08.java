/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

/**
 *
 * @author ifnmg
 */
import java.util.Scanner;
public class Atividade08 {
    /*4. Construa um programa que imprima a Tabuada da divisão e multiplicação
de um determinando inteiro informado pelo usuário. A tabuada deve
apresentar das operações e os resultados entre o número e os números
do intervalo entre 1 e 10.*/
    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("-------------------------------------------------");
            System.out.println("Informe um numero:");
            System.out.println("-------------------------------------------------");		
            int numero = scan.nextInt();

            System.out.println("-------------------Tabuada:----------------------");
            for(byte i = 0; i<=10; i++){
                System.out.printf("%d x %d = %d\n", numero, i, numero * i);
            }
            System.out.println("-------------------------------------------------");  
            for(byte i = 1; i<=10; i++){
                System.out.printf("%d ÷ %d = %.2f\n", numero, i, (double) numero / i);
            }
            System.out.println("-------------------------------------------------");

    }
}
