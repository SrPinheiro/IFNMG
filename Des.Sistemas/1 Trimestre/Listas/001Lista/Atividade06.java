import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {
        /*6. Reescreva o programa anterior para que solicite do usuário a quantidade de metros que deseja
converter e depois de realizar a conversão informe ao usuário a quantidade de polegadas. */
        Scanner scan = new Scanner(System.in);
        double delta = 39.3700787;
        System.out.println("-------------------------------------------------");
        System.out.println("Digite a quantidade de metros: ");
        System.out.println("-------------------------------------------------");
        double metros = scan.nextDouble();
        double polegadas = metros*delta;

        scan.close();
        System.out.println("-------------------------------------------------");
        System.out.printf("Polegadas: %.2f\n", polegadas);
        System.out.println("-------------------------------------------------");

    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */