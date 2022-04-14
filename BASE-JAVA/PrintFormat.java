public class PrintFormat{
  public static void main(String[] args){
        /*
         System.out.print = imprime algo no console
         
         System.out.print = imprime algo no console e realiza uma quebra de linha
         
         System.out.printf = imprime algo no console e possui uma caracteristica de adicionar uma variavel dentro do texto
         
         System.out.format = realista a mesma tarefa do System.out.printf
         
         parametros format=
         
         %s = Tipo string (%s funciona para qualquer valor, pois todos eles podem ser convertidos para string)
         %S = Tipos String (soq toda a string aparece maiscula)
         %d = Tipo Inteiro
         %f = Tipo flutuante
         %b = Tipo bollean
         %c = Tipo char
        
         
         \n = quebra de linha
         \t = tubulação
         \" = no java se usa as aspas duplas para escrever dentro do print e caso no seu texto tenha aspas duplas vc tera que utilizar /"  para coloca-la no seu texto
         \\ = escreve 1 barra invertida no console
        exemplos:
        */
    
          String x = "Leonardo";
          int y = 82;
          System.out.print("esse texto aparecera no console");
    
          System.out.println("Isso aqui tbm");
   
          System.out.printf("O %s foi na piscina? \n", x);
    
          System.out.format("se foi ? ele deu %d pulos na piscina \"ve se pode\" ", y);
    
  }
}
