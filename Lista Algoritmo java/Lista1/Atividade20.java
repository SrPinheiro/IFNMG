import java.util.Scanner;

/*20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo
cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até
2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando
desconto até que a resposta seja: “(N) Não” . Informar total de carros com ano até 2000 e total
geral.*/

public class Atividade20 {
    public static void main(String[] args) {
        while(true){
            Float[] k2 = new Float[4];
            Scanner scan = new Scanner(System.in);
            try{
                line(45);
                System.out.println("\nDigite o valor do carro:");
                line(45);
                k2[0] = scan.nextFloat();
                line(45);
                System.out.println("\nAgora digite o ano do carro:");
                line(45);
                k2[1] = scan.nextFloat();
                if(k2[1] <=200){
                    ++k2[3];
                    ++k2[4];
                    line(45);
                    System.out.printf("\nDesconto= R$%.2f (12%)\n",(k2[0])*0,12);
                     // (k2[0]*0.88) é a mesma coisa que k2-(k2*0.12)
                    System.out.printf("valor a ser pago= R$%.2f\n", (k2[0]*0.88));
                    line(45);
                }else{
                    ++k2[3];
                    line(45);
                    System.out.printf("\nDesconto= R$%.2f (7%)\n",(k2[0])*0,12);
                    // (k2[0]*0.93) é a mesma coisa que k2-(k2*0.07)
                    System.out.printf("valor a ser pago= R$%.2f\n", (k2[0]*0.93));
                    line(45);
                }
                System.out.println("deseja continuar? [S]Sim e [N]Não");
                String c = scan.nextLine();
                if(Character.toString(c.trim().charAt(0)).equalsIgnoreCase("n")){
                    line(45);
                    System.out.println("\nPrograma Encerrado!");
                    System.out.printf("Carros ate 2000: %d\n", k2[4]);
                    System.out.printf("Total de carros: %d\n", k2[3]);
                    line(45);
                    scan.close();
                    break;
                }            
            }catch(Exception e){
                line(45);
                System.out.println("\nAlgo de errado, digite apenas numeros!");
                System.out.println("Diferencie as casas decimais por virgula!");
                System.out.printf("Codigo do erro = %s\n", e.getClass().getSimpleName());
                line(45);
                    scan.nextLine();
            }
        }
    }


    static void line(int c){
        String linha = "";

        for(int i = 0; i < c; i++){
            linha += "=";
        }
        System.out.print(linha);
    }
}
