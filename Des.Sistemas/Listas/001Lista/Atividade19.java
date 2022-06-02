import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        /*19. As laranjas custam R$ 0,50 cada se forem compradas menos do que uma dúzia, e R$ 0,30 se
forem compradas pelo menos doze. Escreva um programa que leia o número de laranjas
compradas, calcule e escreva o valor total da compra. */

        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite quantas laranjas deseja comprar:");
        System.out.println("-------------------------------------------------");
        int quantidade = scan.nextInt();

        scan.close();
        if(quantidade > 0){
            if(quantidade < 12){
                System.out.println("-------------------------------------------------");
                System.out.printf("Quantidade: %d\n", quantidade);
                System.out.printf("Preco: R$%.2f\n", quantidade*0.5);
                System.out.println("-------------------------------------------------");
            }else{
                System.out.println("-------------------------------------------------");
                System.out.printf("Quantidade: %d\n", quantidade);
                System.out.printf("Preco: R$%.2f\n", quantidade*0.3);
                System.out.println("-------------------------------------------------");
            }
        }else{
            System.out.println("-------------------------------------------------");
            System.out.printf("Quantidade \"%d\" invalida\n",quantidade);
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