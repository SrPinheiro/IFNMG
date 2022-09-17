import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        /*18. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha
válida é o número 1234. Devem ser impressas as seguintes mensagens: */
        double senha = 1234;

        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Digite a senha da formula do Hamburguer de siri:");
        System.out.println("-------------------------------------------------");
        double tentativa = scan.nextDouble();
        
        scan.close();
        if(tentativa == senha){
            System.out.println("-------------------------------------------------");
            System.out.println("ACESSO PERMITIDO!");
            System.out.println("A formula esta em suas mãos!");
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("ACESSO NEGADO!");
            System.out.println("Os alarmes dispararam, corra imediatamente!");
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