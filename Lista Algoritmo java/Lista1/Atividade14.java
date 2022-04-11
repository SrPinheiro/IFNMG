import java.util.Scanner;

//14. Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.
public class Atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        String num1 = scan.nextLine();
        System.out.println("Agora digite o segundo numero:");
        String num2 = scan.nextLine();
        scan.close();
        try{
            if((Float.parseFloat(num1)) > (Float.parseFloat(num2))){
                System.out.printf("%.2d é maior do que %.2d", num1, num2);
            }else if((Float.parseFloat(num1)) < (Float.parseFloat(num2))){
                System.out.printf("%.2d é maior do que %.2d", num2, num1);
            }else{
                System.out.println("os numeros são identicos!");
            }
        }catch(Exception e){
            System.out.println("algo de errado, digite apenas numeros!");
            System.out.printf("Codigo de Erro= %s", e.getClass().getSimpleName());
        }
    }
}
