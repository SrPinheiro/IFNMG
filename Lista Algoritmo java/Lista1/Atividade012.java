/*12. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a
percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja
de 28% e os impostos 45%. Escrever um algoritmo que leia o custo de fábrica de um carro e
informe o custo ao consumidor do mesmo.*/
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float fabrica = 0f;
        while(true){
            System.out.println("Digite o valor de fabrica do veiculo:");
            //try para verificar se o usuario digitou apenas numeros!
            try{
                fabrica = scan.nextFloat();
                if(fabrica <1){
                    System.out.println("O valor do carro não pode ser igual ou menor que 0!");
                }
                else{
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Digite apenas numeros!");
                System.out.printf("Codigo do erro= %s\n", e);
                scan.nextLine();
                
            }
        }
        scan.close();
        System.out.printf("Valor de fabrica= %.2f\n", fabrica);
        // (fabrica * 1.45) é a mesma coisa que fabrica+(fabrica*0.45) ou seja adicionar 45% de imposto no valor
        System.out.printf("valor final= %.2f\n", (fabrica*1.45)*1.28);
        System.out.printf("valor do imposto= %.2f\n", fabrica*0.45);
        System.out.printf("taxa da empresa = %.2f",(fabrica*1.45)*0.28);
        
    }   
}
