/*4. Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas
efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.*/

import java.util.Scanner;

public class Atividade4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nome;
        Float salario, vendas;

        System.out.println("Digite seu nome abaixo:");

        nome = input.nextLine();

        System.out.println("Digite abaixo seu salario fixo");

        salario = input.nextFloat();

        System.out.println("Digite abaixo o valor total de suas vendas nesse mês:");

        vendas = input.nextFloat();

        System.out.format("Nome = %s\n", nome);

        System.out.format("Salario fixo = %.2f\n", salario);
        
        System.out.format("Salario final = %.2f", salario + (vendas*15/100));
        
        input.close();



    }
}