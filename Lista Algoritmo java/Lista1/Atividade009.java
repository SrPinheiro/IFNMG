/*9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após
um mês. Considere fixo o juro da poupança em 0,70% a. m.*/
import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor a ser depositado");

        float deposito = scan.nextFloat();

        scan.close();
        
        System.out.printf("Valor inicial= %.2f\nValor seguinte= %.2f", deposito,(deposito+(deposito*0.7)));
    }
}
