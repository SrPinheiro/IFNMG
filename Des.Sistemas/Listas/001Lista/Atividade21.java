import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        /*21. Escreva um programa que leia as medidas dos lados de um triângulo e
escreva se ele é equilátero, isósceles ou escaleno. */

        Scanner scan = new Scanner(System.in);

        double[] lados = new double[3];

        for(byte i = 0; i < 3; i++) {
            System.out.printf("Digite o %sº lado:", i+1);
            lados[i] = (int) scan.nextDouble();
        }

        scan.close();
        if( lados[0] < lados[1] + lados[2] && lados[1] < lados[0] + lados[2] && lados[2] < lados[0] + lados[1] ){ // verificando se é possivel formar um triangulo!
            if(lados[0] == lados[1] && lados[1] == lados[2]){
                System.out.println("-------------------------------------------------");
                System.out.println("é um triangulo EQUILATERO!");
                System.out.println("-------------------------------------------------");
            }else if(lados[0] == lados[1] || lados[1] == lados[2] || lados[2] == lados[0]){
                System.out.println("-------------------------------------------------");
                System.out.println("é um triangulo ISOCELES!");
                System.out.println("-------------------------------------------------");
            }else{
                System.out.println("-------------------------------------------------");
                System.out.println("é um triangulo ESCALENO!");
                System.out.println("-------------------------------------------------");
            }
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("NÃO É POSSIVEL FORMAR UM TRIANGULO COM ESSAS MEDIDAS!!");
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