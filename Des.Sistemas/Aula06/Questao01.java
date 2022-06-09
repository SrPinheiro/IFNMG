import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[2];

        for (byte i = 0; i < 2; i++) {
            System.out.println("-------------------------------------------------");
            System.out.printf("Digite o %sº numero:\n", i + 1);
            System.out.println("-------------------------------------------------");
            numeros[i] = scan.nextInt();
        }
        scan.close();

        if (numeros[0] > numeros[1]) {
            System.out.println("-------------------------------------------------");
            System.out.printf("o 1º numero é maior que o 2º numero! %s\n", numeros[0]);
            System.out.println("-------------------------------------------------");

        } else if (numeros[0] < numeros[1]) {
            System.out.println("-------------------------------------------------");
            System.out.printf("o 2º numero é maior que o 1º numero! %s\n", numeros[0]);
            System.out.println("-------------------------------------------------");

        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("Os numeros sao iguais!");
            System.out.println("-------------------------------------------------");
        }
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA - JetBrains
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */
