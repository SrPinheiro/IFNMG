/*2. Construa um programa para encontrar todos os números pares entre 1 e 100.*/
public class Atividade02 {
    public static void main(String[] args) {
        byte par = 0;
        
        for(byte i = 1; i<=100; i++){
            if(i%2 != 0){
                continue;
            }
            par++;
            System.out.println("-------------------------------------------");
            System.out.printf("o Numero: %d é PAR!\n", i);
            System.out.printf("Pares: %d\n", par);
            System.out.println("-------------------------------------------");
        }
        
    }
}
/**
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA - JetBrains
 * Turma: Info 0121
 * IFNMG - Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 */
