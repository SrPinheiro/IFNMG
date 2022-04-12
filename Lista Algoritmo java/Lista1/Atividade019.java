import java.util.Arrays;
import java.util.Scanner;

/*19. Escrever um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é
homem ou mulher. No final informe total de homens e de mulheres.*/

public class Atividade019{
    public static void main(String[] leo) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] sexo = new int[3];
        Arrays.fill(sexo,0);
        String nome;
        for(short i = 1; i <5; i++){
            try{
            System.out.println("=================================");
            System.out.printf("Digite o nome da %dº pessoa:", i);
            System.out.println("\n=================================");
            nome = scan.nextLine();
            System.out.println("=================================");
            System.out.println("Digite o sexo da pessoa:[1] Homem [2]Mulher:");
            System.out.println("=================================");
            sexo[2] = scan.nextInt();
        
            if(sexo[2] == 1){
                System.out.println("=================================");
                System.out.printf("%s é do sexo masculino!\n", nome);
                System.out.println("=================================");
                scan.nextLine();
                ++sexo[0];
            }else if(sexo[2] == 2){
                System.out.println("=================================");
                System.out.printf("%s é do sexo Feminino!\n", nome);
                System.out.println("=================================");
                scan.nextLine();
                ++sexo[1];
            }else{
                System.out.println("Algo de errado, não foi possivel definir o sexo!");
            }
            }catch(Exception e){
                System.out.println("\n==================================");
                System.out.println("Algo de errado, digite apenas numeros!");
                System.out.println("Diferencie as casas decimais por virgula!");
                System.out.printf("Codigo do erro = %s\n", e.getClass().getSimpleName());
                System.out.println("==================================");
                scan.nextLine();
            }
        }scan.close();
    }
}