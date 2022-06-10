
package lista02;

import java.util.Scanner;

public class Atividade08 {
    /*3. Construa um programa conversor de escalas de temperaturas. O usuário deverá escolher de
qual escala para qual escala deseja fazer a conversão, solicitar o valor e em seguida imprimir o
valor correspondente na nova escala:*/
    public static void main(String[] args) {
        byte opcao;
        double resultado;
        double temperatura;
        
        Scanner scan = new Scanner(System.in);
        
        whileExterno: while(true){
            System.out.println("-------------------------------------------------");
            System.out.println("1. Celsius para Kelvin");
            System.out.println("2. Celsius para Fahrenheit");
            System.out.println("3. Fahrenheit para Celsius");
            System.out.println("4. Kelvin para Celsius");
            System.out.println("5. Fahrenheit para Kelvin");
            System.out.println("6. Kelvin para Fahrenheit");
            System.out.println("7. Sair do Programa");
            System.out.println("-------------------------------------------------");
            opcao = scan.nextByte();
            
            switch(opcao){
                case 1:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite a temperatura em Celsius:");
                    System.out.println("-------------------------------------------------");
                    
                    temperatura = scan.nextDouble();
                    resultado = temperatura + 273.15;
                    
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Celsius: %.2f\n", temperatura);
                    System.out.printf("Kelvin: %.2f\n", resultado);
                    System.out.println("-------------------------------------------------");
                    break;
                    
                case 2:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite a temperatura em Celsius:");
                    System.out.println("-------------------------------------------------");
                    
                    temperatura = scan.nextDouble();
                    resultado = (temperatura * 1.8) + 32;
                    
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Celsius: %.2f\n", temperatura);
                    System.out.printf("Fahrenheit: %.2f\n", resultado);
                    System.out.println("-------------------------------------------------");
                    break;
                    
                case 3:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    System.out.println("-------------------------------------------------");
                    
                    temperatura = scan.nextDouble();
                    resultado = (temperatura - 32) / 1.8;
                    
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Fahrenheit: %.2f\n", temperatura);
                    System.out.printf("Celsius: %.2f\n", resultado);
                    System.out.println("-------------------------------------------------");
                    break;
                    
                case 4:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite a temperatura em Kelvin:");
                    System.out.println("-------------------------------------------------");
                    
                    temperatura = scan.nextDouble();
                    resultado = temperatura - 273.15;
                    
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Kelvin: %.2f\n", temperatura);
                    System.out.printf("Celsius: %.2f\n", resultado);
                    System.out.println("-------------------------------------------------");
                    break;
                    
                case 5:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    System.out.println("-------------------------------------------------");
                    
                    temperatura = scan.nextDouble();
                    resultado = (temperatura  + 459.67) * 5/9; //formula: K = (°F + 459,67) x 5/9
                    
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Fahrenheit: %.2f\n", temperatura);
                    System.out.printf("Kelvin: %.2f\n", resultado);
                    System.out.println("-------------------------------------------------");
                    break;
                    
                case 6:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite a temperatura em Kelvin:");
                    System.out.println("-------------------------------------------------");
                    
                    temperatura = scan.nextDouble();
                    resultado = temperatura * 1*8 - 459.67; //formula: Kelvin x 1.8 - 459.67
                    
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Kelvin: %.2f\n", temperatura);
                    System.out.printf("Fahrenheit: %.2f\n", resultado);
                    System.out.println("-------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Programa Encerrado!");
                    System.out.println("-------------------------------------------------");
                    break whileExterno;
                        
            }
            
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