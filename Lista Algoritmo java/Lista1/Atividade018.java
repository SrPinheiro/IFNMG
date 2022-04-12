import java.util.Scanner;

/*18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de
idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior
de idade.*/

public class Atividade018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(short i = 1; i <76; i++){
            float idade;
            try{
                System.out.println("==================================");
                System.out.printf("Digite a idade da %dº pessoa:", i);
                idade = scan.nextFloat();
                if(idade >=18){
                    System.out.println("Essa pessoa é maior de idade!");
                }else{
                    System.out.println("Essa pessoa é menor de idade!");
                }System.out.println("==================================");
            }catch(Exception e){
                System.out.println("\n==================================");
                System.out.println("Algo de errado, digite apenas numeros!");
                System.out.println("Diferencie as casas decimais por virgula!");
                System.out.printf("Codigo do erro = %s\n", e.getClass().getSimpleName());
                System.out.println("==================================");
                scan.nextLine();
            }
        }
        scan.close();
        
    }
}
