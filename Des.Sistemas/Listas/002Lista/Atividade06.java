package lista02;

import java.util.Scanner;

public class Atividade06 {
    /*1. Uma pizzaria fornece 10% de desconto para funcionários e 5% de desconto para clientes vips.
Faça um programa que calcule o valor total a ser pago pela venda de uma pizza. O programa
deverá ler o valor da compra e um código que indica o tipo de cliente: 1-Comum, 2-Vip e 3-
Funcionário.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double desconto = 0;
        double valor;
        double valorFinal;
        int codigo;
        
        System.out.println("-------------------------------------------");
        System.out.println("Digite o valor total da compra:");
        System.out.println("-------------------------------------------");
        valor = scan.nextDouble();
        
        System.out.println("-------------------------------------------");
        System.out.println("Digite seu codigo:");
        System.out.println("-------------------------------------------");
        codigo = scan.nextInt();
        
        switch(codigo){
            case 1:
                break;
                
            case 2:
                System.out.println("-------------------------------------------");
                System.out.println("Cliente VIP!!!!");
                System.out.println("-------------------------------------------");
                desconto = 0.05;
                break;
                
            case 3:
                System.out.println("-------------------------------------------");
                System.out.println("Funcionario!");
                System.out.println("-------------------------------------------");
                desconto = 0.1;
                break;
                
            default:
                System.out.println("-------------------------------------------");
                System.out.println("Codigo invalido! Desconto nao aplicado!");
                System.out.println("-------------------------------------------");
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Valor da compra: %.2f\n", valor);
        System.out.printf("Valor Com Desconto de %.2f%%: %.2f\n",desconto, valor * (1 - desconto));
        System.out.println("-------------------------------------------");
        
        
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA - JetBrains
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */
