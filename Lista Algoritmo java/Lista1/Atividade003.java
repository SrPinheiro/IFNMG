//3. Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a
//distância total percorrida pelo automóvel e o total de combustível gasto.
import java.util.Scanner;
public class Atividade003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float dist,comb;

        System.out.println("Informe a distancia percorrida pelo veiculo:");

        dist = input.nextFloat();

        System.out.println("Informe o total de combustivel gasto!");

        comb = input.nextFloat();

        System.out.format("O Consumo medio do seu veiculo é de %2.f", dist/comb);
        
        input.close();
    }
}