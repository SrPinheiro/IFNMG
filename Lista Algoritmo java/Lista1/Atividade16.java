import java.util.Scanner;
/*16. Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).*/

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] lista = new float[4];
        try{
        for(short i = 1; i<4;i++){
            System.out.printf("Digite o %dº numero:\n", i);
            lista[i-1] = scan.nextFloat();            
        }
        }catch(Exception e){
        System.out.println("Algo de errado, digite apenas numeros!");
        System.out.println("dividea os decimos por virgula!");
        System.out.printf("codigo do erro = %s\n", e);
        }for(short i =0; i<3; i++){
            lista[3] += lista[i];
        }
        scan.close();
        System.out.printf("Media = %.2f\n", (lista[3]/3) );
        if((lista[3]/3) >= 7){
            System.out.println("Situação = Aprovado!");
    }else if((lista[3]/3) <=5){
        System.out.println("Situação = Recuperação!");
    }else{
        System.out.println("Situação = Reprovado!");
    }
    }
}
