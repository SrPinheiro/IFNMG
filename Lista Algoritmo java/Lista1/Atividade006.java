/*6. Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável
A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
Apresentar os valores trocados.*/

public class Atividade006 {
    public static String rt(String x, String y){
        return x;

    }
    public static void main(String[] args) {
        String a = "mundo", b = "ola ";

        a = rt(b, b=a);
        System.out.println(a + b);
    }
}
