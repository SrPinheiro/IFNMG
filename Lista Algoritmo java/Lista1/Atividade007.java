/* 7. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A
fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a
temperatura em Celsius. */

import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");

        Float c = input.nextFloat();

        System.out.printf("A temperatura %.2f convertida em Fahrenheit é: %.2f", c, (9*c+160)/5);
        
        input.close();
    }
    
}
