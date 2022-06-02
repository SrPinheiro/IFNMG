import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        /*13. Sabendo que uma pedra cai com uma aceleração 20,2m/s2, faça um
programa que solicite do usuário uma duração (tempo) em minutos e calcule a
altura necessária para que ao ser largada a pedra caia e atinja o solo no tempo
informado pelo usuário. */

        // altura = (a*t)²/2
        double aceleracao = 20.2; // m/s²

        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Digite o tempo desejado(em segundos):");
        System.out.println("-------------------------------------------------");
        double tempo = scan.nextDouble();
        
        double delta = aceleracao * Math.pow(tempo,2);

        scan.close();
        System.out.println("-------------------------------------------------");
        System.out.printf("Distancia necessaria: %.1fm\n", delta/2);
        System.out.println("-------------------------------------------------");

        
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */