import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        try{
            System.out.println("Digite o 1 numero:");
            num1 = Double.parseDouble(scan.nextLine());

            System.out.println("Digite o 2 numero:");
            num2 = Double.parseDouble(scan.nextLine());
            System.out.println("=============================================");
            System.out.printf("Soma= %s + %s : %s \n",num1,num2, num1+num2);

            if(num1 > num2){
                System.out.println("=============================================");
                System.out.printf("Maior: %s\n", num1);
                System.out.printf("Menor: %s\n", num2);
            }else{
                System.out.printf("Maior: %s\n", num2);
                System.out.printf("Menor: %s\n", num1);
            }
            System.out.println("=============================================");
            System.out.printf("Potencia: %s\n", Potencia(num1,num2));

            num2=0;
            do{
                System.out.println("Digite um numero: ");
                num1 = scan.nextDouble();
                num2 += num1;
            }while(num1 != 0);
            
            System.out.printf("Soma de todos: %.2f\n", num2);
            System.out.println("=============================================");

        }catch (Exception e){
            System.out.println("Digite apenas numeros!");
            System.out.printf("erro: %s\n", e);
        }
        System.out.println("=============================================");
        }

    static double Potencia(double x, double y){
        return Math.pow(x,y);
    }
}
