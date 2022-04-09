/* 8. Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um
valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a
quantidade de dólares disponíveis com o usuário.*/
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float cotacao, dolar;

        while(true){
        System.out.println("Digite o valor do dolar:");

        cotacao = scan.nextFloat();

        if(cotacao > 0){

         break;
        }
        else{
            System.out.printf("o valor %.2f é invalido!", cotacao);}
        }

        System.out.println("Digite a quantidade de dolares para converter:");
        
        dolar = scan.nextFloat();
        
        scan.close();

        System.out.printf("Dolar = %.2f\nReal = %.2f",dolar, (dolar*cotacao));
    }

}
