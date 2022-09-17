package questao02;

public class Principal {
    public static void main(String[] args) {
        Cafeteira cafeteira = new Cafeteira("PoliShop");

        cafeteira.prepararCafe();// vai preparar o cafe
        cafeteira.beber();// vai beber o cafe
        cafeteira.prepararCafe(); // vai pedir para limpar a cafeteira
        cafeteira.limpar(); // vai limpar a cafeteira
        cafeteira.prepararCafe(); // vai preparar o cafe

    }
}
/*
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA — JetBrains
 * Turma: Info 0121
 * IFNMG — Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 * Data:
 */
