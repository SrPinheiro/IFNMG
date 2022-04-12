 // 1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
import java.util.ArrayList;
import java.util.Scanner;
public class Atividade001{

    static void linha(){ 
        // função que multiplica o texto criando uma linha
        String c = "";
        for(short i = 0; i < 100; i++){
            c += "=";
        }
        System.out.println(c);
    }

    public static void clear(){
        // função que limpa o terminal
        for(short i = 0; i < 100; i++){
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<String>(); // arraylist = lista
        Scanner input = new Scanner(System.in); // aqui eu criei um scanner que vai ler o teclado
        clear();
        linha();
        System.out.println("Digite o primeiro Numero abaixo");
        linha();
        numeros.add(input.nextLine());
        clear();
        linha();
        System.out.println("Digite o segundo Numero abaixo");
        linha();
        numeros.add(input.nextLine());
        input.close();
        clear();
        try{
        // try e catch servem para verificar se o usuario digitou apenas numeros!
        System.out.format("A soma do numero %.2f com o numero %.2f é igual a %.2f", Float.parseFloat(numeros.get(0)), Float.parseFloat(numeros.get(1)), (Float.parseFloat(numeros.get(0)) + Float.parseFloat(numeros.get(1))));
        }
        catch(NumberFormatException o){
            linha();
            System.out.println("Algo de errado, por favor digite apenas numeros!");
            linha();
        }
        
    }
}
