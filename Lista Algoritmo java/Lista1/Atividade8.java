/* 8. Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um
valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a
quantidade de dólares disponíveis com o usuário.*/
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        float cotacao=0, dolar=0;
        short i = 1;
        System.out.println("aperte [1] para pegar o valor do dolar e qualquer outro numero para digita-lo");
        i = scan.nextShort();
        if(i == 1){
            cotacao = dolares();
            if(cotacao == -404.404f){
                System.out.println("algo de errado com a a conexão, tente novamente mais tarde!");
                i = 2;
            }else{
                System.out.printf("Dolar = R$%.2f\n", cotacao);
            }
        }
        while(i!=1){
        System.out.println("Digite acotação do dolar:");
            // ***ATENÇÃO*** USE VIRGULA PARA SEPARAR OS DECIMOS
        cotacao = scan.nextFloat();
        if(cotacao > 0){
         break;
        }
        else{
            System.out.printf("o valor %.2f é invalido!", cotacao);}
        }
        System.out.println("Digite a quantidade de dolares para converter:");

        // ***ATENÇÃO*** USE VIRGULA PARA SEPARAR OS DECIMOS
        dolar = scan.nextFloat();
        scan.close();
        System.out.printf("Dolar = US$%.2f\nReal = R$%.2f",dolar, (dolar*cotacao));
    }


    public static float dolares(){
        //Isso aqui é uma função que puxa o valor do dolar pela internet ^^
        String sb="";
        float a = 0;
        try{
            //aqui o programa vai fazer uma tentativa de se comunicar com a API
        URL url =  new URL("https://economia.awesomeapi.com.br/json/last/USD-BRL");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if(conn.getResponseCode() == 200){
                //aqui o programa ja conseguiu se conectar com a API e esta puxando informação
                Scanner scn = new Scanner(url.openStream());
                sb = new String(scn.nextLine());
                //substring pega as strings que estão no intervalo citado entre parenteses
                a = Float.parseFloat(sb.substring(154,160));
            }
            // vai retornar o valor "-404.404" caso a função não consiga obter o valor do dolar automaticamente
        }
        catch(Exception e){
            a = -404.404f;
        }
        return a;
    }
}


