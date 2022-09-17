import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args){
        /*9. Escreva um programa que receba o valor da cotação do dólar em reais, em seguida receba um
determinado valor em real e faça a conversão. Imprima o resultado. */

        //Professor, provavelmente vc nem vai estar lendo isso ksakask mas eu dei um get em
        //um site para poder obter o valor da cotacao do dolar!!
       Scanner scan = new Scanner(System.in);
        float cotacao=0, dolar=0;
        short i;
        do{
         System.out.println("--------------------------------------------------------------------");
        System.out.println("aperte [1] para pegar obter valor do dolar ou [2] para digita-lo");
         System.out.println("--------------------------------------------------------------------");
        i = scan.nextShort();
        if(i == 1 ){
            cotacao = dolares();
            if(cotacao == -404.404f){
                 System.out.println("--------------------------------------------------------------------");
                System.out.println("algo de errado com a a conexão, tente novamente mais tarde!");
                 System.out.println("--------------------------------------------------------------------");
                i = 2;
            }else if(i == 2){
                 System.out.println("--------------------------------------------------------------------");
                System.out.printf("Dolar = R$%.2f\n", cotacao);
                 System.out.println("--------------------------------------------------------------------");
                break;
            }else if(i !=1){
                 System.out.println("--------------------------------------------------------------------");
                System.out.println("Opção Invalida! Digite apenas [1] ou [2]");
                 System.out.println("--------------------------------------------------------------------");
            }
        }
    }while(i != 1 && i!= 2);

        while(i == 2){
            while(true){
                try{
                     System.out.println("--------------------------------------------------------------------");
                    System.out.println("Digite a cotação do dolar:");
                     System.out.println("--------------------------------------------------------------------");
                        // ***ATENÇÃO*** USE VIRGULA PARA SEPARAR OS DECIMOS
                    cotacao = scan.nextFloat();
                    break;
                
                }catch(Exception e){
                     System.out.println("--------------------------------------------------------------------");
                    System.out.println("Digite apenas Numeros!");
                    System.out.println("Utilize \",\" para separar os decimos!");
                     System.out.println("--------------------------------------------------------------------");
                    scan.nextLine(); // esse scan serve para que o sistema não entre em loop infinito
                }
            }
        if(cotacao > 0){
         break;
        }
        else{
             System.out.println("--------------------------------------------------------------------");
            System.out.printf("o valor %.2f é invalido!\n", cotacao);}
             System.out.println("--------------------------------------------------------------------");
        }
         System.out.println("--------------------------------------------------------------------");
        System.out.println("Digite a quantidade de dolares para converter:");
         System.out.println("--------------------------------------------------------------------");

        // ***ATENÇÃO*** USE VIRGULA PARA SEPARAR OS DECIMOS
        dolar = scan.nextFloat();
        scan.close();
         System.out.println("--------------------------------------------------------------------");
        System.out.printf("Cotacao: R$%.2f\nDolar: US$%.2f\nReal: R$%.2f\n",cotacao,dolar, (dolar*cotacao));
         System.out.println("--------------------------------------------------------------------");
    }


    static float dolares(){
        //Isso aqui é uma função que puxa o valor do dolar pela internet ^^
        String sb="";
        float resultado = 0;
        try{
            //aqui o programa vai fazer uma tentativa de se comunicar com a API
        URL url =  new URL("https://economia.awesomeapi.com.br/json/last/USD-BRL"); // site que contem a cotacao em tempo real
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if(conn.getResponseCode() == 200){
                //aqui o programa ja conseguiu se conectar com a API e esta puxando informação
                Scanner scn = new Scanner(url.openStream());
                sb = new String(scn.nextLine());
                //substring vai separar o valor do dolar do resto da String
                resultado = Float.parseFloat(sb.substring(155,161));
            }
        }
        catch(Exception e){
            // vai retornar o valor "-404.404" caso a função não consiga obter o valor do dolar automaticamente
            resultado = -404.404f;
        }
        return resultado;
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */