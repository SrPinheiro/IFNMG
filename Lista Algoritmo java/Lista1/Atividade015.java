import java.util.Scanner;

//15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e
//200.
public class Atividade015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        scan.close();
        if (num >= 100 & num <=200){
            System.out.println("O numero %.2f esta no intervalo entre 100 e 200!");
        }else{
            System.out.println("o numero %.2f não esta no intervalo entre 100 e 200!");
        }
    }
}
