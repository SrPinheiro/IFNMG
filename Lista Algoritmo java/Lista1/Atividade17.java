import java.util.ArrayList;
import java.util.Scanner;

/*17. Ler 80 números e ao final informar quantos número (s) est (á) ão no intervalo entre 10 (inclusive)
e 150 (inclusive).*/


public class Atividade17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Float> num = new ArrayList<Float>();
        for(short i = 1; i < 81; i++) {
            try{
            System.out.printf("Digite o %dº numero: ", i);
            num.add(scan.nextFloat());
            }catch(Exception e){
                System.out.println("===================================");
                System.out.println("Digite apenas numeros!");
                System.out.println("Use virgula para diferenciar decimais!");
                System.out.printf("Erro codigo = %s\n", e.getClass().getSimpleName());
                System.out.println("===================================");
                break;
            }
        }
        scan.close();
        short c = 0;
        for (Float i : num) {
            if( i >=10 & i <=150){
                c+=1;
            }
        }
        //verifica se tem 80 numeros dentro da lista
        if(num.size() == 80){
            System.out.println("===================================");
        System.out.println("intervalo = 10 - 150");
        System.out.printf("Total de numeros no intervalo = %d\n", c);
        System.out.println("===================================");
        }
    }
}
