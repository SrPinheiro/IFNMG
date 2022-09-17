import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
        /*4. Construa um programa que imprima a Tabuada da divisão e multiplicação
        de um determinando inteiro informado pelo usuário. A tabuada deve
        apresentar das operações e os resultados entre o número e os números
        do intervalo entre 1 e 10.*/

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
/**
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA - JetBrains
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */