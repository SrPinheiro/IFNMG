import java.util.Scanner;

/*13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja
maior que 10.*/

public class Atividade013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        Double num = scan.nextDouble();
        if(num >10){
            System.out.printf("O numero %.2f é maior que 10!\n",num);

        }else{
            System.out.printf("o numero %.2f é menor ou igual a 10!", num);
        }
        scan.close();
    }
}
