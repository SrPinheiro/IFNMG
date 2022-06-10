import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
                System.out.println("-------------------------------------------------");
		System.out.println("Informe um numero:");
                System.out.println("-------------------------------------------------");		
                int numero = scan.nextInt();
		
                System.out.println("-------------------------------------------------");
		for(byte i = 0; i<=10; i++){
		    System.out.printf("%d x %d = %d\n", numero, i, numero * i);
		}
                System.out.println("-------------------------------------------------");  
		for(byte i = 1; i<=10; i++){
		    System.out.printf("%d ÷ %d = %.2f\n", numero, i, (double) numero / i);
		}
                System.out.println("-------------------------------------------------");
	}
}
