import java.util.Scanner;
public class Repeticao{
    public static void main(String[] args) {

/*for = for(variavel; condicao; incremento)

variavel = você precisa criar e inicializar uma variavel que sera utilizada pelo for!
condicao = condicao em que ira decidir se o programa vai dar mais voltas ou nao!
incremento = sequencia matematica em que a variavel ira seguir a cada ciclo!

exemplo:
*/
    System.out.println("====================================");
    System.out.println("FOR");


     for(int i=0; i <10; i++) {
        System.out.println("Volta numero = " + i);
     }


     System.out.println("===================================="); 
     
/*
foreach = for(variavel : Array)

varaivel= vc precisa criar e iniciar uma variavel que sera utilizada para ler os dados da array 1 de cada vez
array = lista em que os dados estao armazenados

exemplo:
*/
     System.out.println("====================================");
     System.out.println("Foreach");

     //olhe o arquivo sobre Arrays
     String[] lista = new String[6];
     lista[0] = "SKLeo";
     lista[1] = "Lari girl";
     lista[2] = "loguito-sama";
     lista[3] = "joaquina";
     lista[4] = "lalaia";
     lista[5] = "lipejar";

     for (String a : lista) {
         System.out.print("grupo = " + a);
     }

     System.out.println("====================================");
    
/*
while = while(condicao)
condicao = se a condicao for verdadeira o programa ira dar um loop, se ela for falsa o loop sera encerrado!

exemplo:
String condicao = "sim";
while(condicao.equals("sim")){
#(codigo)
}
*/
        System.out.println("====================================");
        System.out.println("while");

        String condicao = "sim";
        while(condicao.equals("sim")){
            Scanner scan = new Scanner(System.in);
            System.out.println("deseja continuar? [sim]");
            condicao = scan.nextLine();
        }

        System.out.println("====================================");

    }
}
