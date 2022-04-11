
/*11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-
se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo
usuário.*/
import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("qual o preço de fabrica do produto?");
        float fab = scan.nextFloat();
        System.out.println("qual a porcentagem do acrescimo? [digite em dimal ex = 17 = 17%]");
        short acrescimo = scan.nextShort();
        System.out.printf("Valor final= %.2f", fab+(fab*((float)acrescimo/100)));
        scan.close();
    }
}
