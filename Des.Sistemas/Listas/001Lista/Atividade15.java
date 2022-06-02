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
            if(Double.parseDouble(altura) > 3){
            altura = Double.toString(Double.parseDouble(altura)/100);
            }
            var altura2 = Math.pow(Double.parseDouble(altura), 2);
            var imc = Double.parseDouble(peso)/ altura2;
            System.out.println("-------------------------------------------------");
            System.out.printf("Altura: %sm\n",altura);
            System.out.printf("Peso: %sKg\n",peso);
            System.out.printf("IMC: %.1f\n", imc);
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