import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        /*15. Escreva um programa que solicite ao usuário o seu peso e altura, calcule e imprima seu IMC e
sua classificação. */
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Digite sua altura:");
        System.out.println("-------------------------------------------------");
        var altura = scan.nextLine().replace(",",".");

        System.out.println("-------------------------------------------------");
        System.out.println("Agora digite seu peso:");
        System.out.println("-------------------------------------------------");
        var peso = scan.nextLine().replace(",",".");
        scan.close();

        try{
            if(Double.parseDouble(altura) > 3) {
                altura = Double.toString(Double.parseDouble(altura) / 100);
            }

            var altura2 = Math.pow(Double.parseDouble(altura), 2);
            var imc = Double.parseDouble(peso)/ altura2;
            System.out.println("-------------------------------------------------");
            System.out.printf("Altura: %sm\n",altura);
            System.out.printf("Peso: %sKg\n",peso);
            System.out.printf("IMC: %.1f\n", imc);
            System.out.print("Classificação: ");

            if(imc < 18.5){
                System.out.println("MAGREZA!");
            }else if(imc >= 18.5 && imc <=24.9){
                System.out.println("SAUDAVEL!");
            }else if(imc >= 25 && imc <= 29.9){
                System.out.println("SOBRE-PESO");
            }else if(imc >= 30 && imc <= 34.9){
                System.out.println("Obesidade I GRAU");
            }else if(imc >= 35 && imc <= 39.9){
                System.out.println("Obesidade II GRAU");
            }else if(imc > 30){
                System.out.println("Obesidade III GRAU - ALERTA GRAVE");
            }
            System.out.println("-------------------------------------------------");

        }catch (Exception e){
            System.out.println("-------------------------------------------------");
            System.out.printf("Erro codigo: %s \n", e.getClass().getSimpleName());
            System.out.println("Digite apenas numeros!");
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