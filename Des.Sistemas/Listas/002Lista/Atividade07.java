package lista02;

import java.util.Scanner;

public class Atividade07 {
    /*2. Escreva um programa utilizando o comando switch que imprima um mês de acordo com o
número digitado pelo usuário. (1 – Janeiro,...,12 – Dezembro)*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digita o numero entre 1 a 12:");
        System.out.println("-------------------------------------------------");
        int mes = scan.nextInt();

        switch(mes){
            case 1:
                System.out.println("Mes: Janeiro");
                break;

            case 2:
                System.out.println("Mes: Fevereiro");
                break;

            case 3:
                System.out.println("Mes: Marco");
                break;

            case 4:
                System.out.println("Mes: Abril");
                break;

            case 5:
                System.out.println("Mes: maio");
                break;

            case 6:
                System.out.println("Mes: Junho");
                break;

            case 7:
                System.out.println("Mes: Julho");
                break;

            case 8:
                System.out.println("Mes: Agosto");
                break;

            case 9:
                System.out.println("Mes: Setembro");
                break;

            case 10:
                System.out.println("Mes: Outubro");
                break;

            case 11:
                System.out.println("Mes: Novembro");
                break;

            case 12:
                System.out.println("Mes: Dezembro");
                break;

            default:
                System.out.printf("O mes \"%s\" nao existe no nosso calendario!", mes);
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