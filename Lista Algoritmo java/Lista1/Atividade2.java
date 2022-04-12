/*2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação
e a divisão dos números lidos. */

import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a,b;

        System.out.println("Digite abaixo o primeiro numero:");

        a = input.nextFloat();

        System.out.println("Digite abaixo o segundo numero:");

        b = input.nextFloat();
        
        System.out.format("Soma = %.2f\n", a + b);

        System.out.format("Subtração = %.2f\n", a - b);

        System.out.format("multiplicação = %.2f\n", a * b);
        
        //em java quando se divide um float por 0 ele retorna o valor 'Infinity', aqui em baixo eu fiz
        //um filtro para caso o valor seja 'infinity' ele dar um print falando que a divisão é invalida!
        if(Float.isInfinite(a / b) == true){
            System.out.println("Divisão = Invalida");

        }
        else{
            System.out.format("divisão = %.2f\n", a / b);
        }
        input.close();
    }
}

