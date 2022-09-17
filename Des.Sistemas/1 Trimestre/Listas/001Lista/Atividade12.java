public class Atividade12 {
    public static void main(String[] args) {
        /*12. Sabendo que um veículo está a uma velocidade constante de 15m/s, quantos
quilômetros o veículo percorrerá em 50 minutos? Faça um programa que
faça o cálculo utilizando a equação do movimento retilíneo uniforme. */

        double velocidade = 15; // m/s
        
        double distancia = velocidade * 3000; // distancia em metros

        double distanciaFinal = distancia / 1000; // distancia em KM

        System.out.println("-------------------------------------------------");
        System.out.printf("Distancia Percorrida: %.1fKm\n", distanciaFinal);
        System.out.println("-------------------------------------------------");

    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */
