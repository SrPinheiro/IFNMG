import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        /*17. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem
que diga se ela poderá ou não votar este ano. */

        Scanner scan = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Digite em que ano você nasceu:");
        System.out.println("-------------------------------------------------");
        double ano = scan.nextInt();
        scan.close();

        if((2022 - ano) >= 16){
            System.out.println("-------------------------------------------------");
            System.out.println("Você PODERA votar esse ano!");
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("Você NÃO podera votar esse ano!");
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