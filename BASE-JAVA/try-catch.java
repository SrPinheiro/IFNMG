import java.util.InputMismatchException;
import java.util.Scanner;

public class try-catch{
    public static void main(String[] args){
     /* try{
          #(codigo)
          
          #o Try vai tentar executar um codigo que você criou, caso aconteça algum erro, o try sera encerrado e o catch continuara o codigo
          
         }
         catch(Exception e){
              #(codigo)
              
              #quando acontecer um erro ele ira executar o catch! "Exception E" é um erro universal, se colocar esse parametro qualquer erro que acontecer
              #ele sera jogado no catch com esse parametro
          }
          catch(Exception2 e){
              #(codigo)
              
              # vc tbm pode colocar Exception  exclusivos como o "InputMisMatchException" que é um erro de entrada invalida, colocando esse parametro o catch so sera
              # executado caso aconteça este tipo de erro!
              
          }
          
          finally{
            #codigo
            
            #tudo que colocar no finally sera executado, independente se o codigo deu erro ou não!!
          }
         
       exemplo:
     */     
          
        try{
            Scanner scan = new Scanner(System.in);
        }
        catch(InputMismatchException e){
            System.out.printf("isso aqui so acontecera se ouver erros de entrada!");
        }
        
        catch(Exception e){
            System.out.println("isso aqui aparecera para qualquer erro!");
        }
        
        finally{
            System.out.println("isso aqui sempre vai aparecer, independente se deu erro ou não");
        }
    }
}
