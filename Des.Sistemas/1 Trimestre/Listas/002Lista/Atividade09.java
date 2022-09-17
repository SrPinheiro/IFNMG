import java.util.Scanner;

public class Atividade09 {
    /*5. O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto
de todos os seus antecessores, incluindo si próprio e excluindo o zero. Exemplo de número
fatorial: 6! = 6 x 5 x 4 x 3 x 2 x 1 = 720. Construa um programa que solicite do usuário um número
e imprima o seu fatorial.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 1;
        System.out.println("-------------------------------------------------");
        System.out.println("Digite um numero inteiro!");
        System.out.println("-------------------------------------------------");
        numero = scan.nextInt();
        
        for(int i=1;i <= numero; i++){    
            fatorial*=i;   
        }
        
        System.out.println("-------------------------------------------------");
        System.out.printf("Numero: %d!\n", numero);
        System.out.printf("Fatorial: %d\n", fatorial);
        System.out.println("-------------------------------------------------");
        
        
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA - JetBrains
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */