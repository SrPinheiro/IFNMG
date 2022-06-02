import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
/*Escreva um programa que solicite o nome, sobrenome, endereço, cidade e estado do usuário e
em seguida imprima os dados como no exemplo abaixo:
Nome: Antônio da Silva
Endereço: Rua Bonita, no 99 – Almenara - MG */

        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite seu nome e sobrenome:");
        System.out.println("-------------------------------------------------");
        String nome = scan.nextLine();

        System.out.println("-------------------------------------------------");
        System.out.println("Digite seu endereço:");
        System.out.println("-------------------------------------------------");
        String endereco = scan.nextLine();

        System.out.println("-------------------------------------------------");
        System.out.println("Digite sua cidade e estado:");
        System.out.println("-------------------------------------------------");
        String city_estado = scan.nextLine();
        
        scan.close();
        System.out.println("-------------------------------------------------");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Endereço: %s – %s\n", endereco,city_estado);
        System.out.println("-------------------------------------------------");


    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */