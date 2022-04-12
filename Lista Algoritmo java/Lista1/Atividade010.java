import java.util.Scanner;

/*10. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.*/
public class Atividade010 {
    public static void main(String[] args) {
        float prod;
        short vzs;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        prod = scan.nextFloat();
        while(true){
        System.out.println("Deseja dividir em quantas vezes?");
        vzs = scan.nextShort();
        if(vzs >5 | vzs < 1){
            System.out.println("So dividimos em apenas 5 parcelas!");
        }else{
            break;
        }}
        scan.close();
        System.out.printf("valor total = R$%.2f\nParcelas = %d\nValor mensal = R$%.2f", prod, vzs, (prod/(float)vzs));
    }
}
