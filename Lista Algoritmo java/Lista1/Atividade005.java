/*5. Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve
no semestre. No final informar o nome do aluno e a sua média (aritmética).*/

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade005 {
    public static void main(String[] args) {
        String nome;
        ArrayList<Float> notas = new ArrayList<Float>();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo:");

        nome = input.nextLine();
        
        for(short i = 1; i <4; i++){
            System.out.printf("Digite abaixo sua %dº nota", i);
            notas.add(input.nextFloat());
        }
        //notas.size() - pega a quantidade de valores que tem dentro da lista
        notas.add((notas.get(0)+ notas.get(1) + notas.get(2))/notas.size());

        System.out.printf("%s, sua media aritmética foi de %.2f pontos", nome, notas.get(3));
        input.close();
    }
    
}
