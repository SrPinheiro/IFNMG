package questao04;

public class Game {
    public static void main(String[] args) {
        Personagem player1 = new Personagem("Link");
        Personagem player2 = new Personagem("Zelda");
        Zoombie zumbi1 = new Zoombie();
        Skeleton esqueleto1 = new Skeleton();

        //testando informacoes
        player1.Informacoes();
        player2.Informacoes();
        zumbi1.Informacoes();

        //atacando zumbi
        System.out.printf("Vida do zumbi: %s\n", zumbi1.getVida());
        player1.atacar(zumbi1);
        System.out.printf("Vida do zumbi: %s\n", zumbi1.getVida());

        //atacando player
        System.out.printf("Vida do jogador1: %s\n", player1.getVida());
        zumbi1.atacar(player1);
        System.out.printf("Vida do jogador1: %s\n", player1.getVida());

        //testando morte
        System.out.printf("Vida do zumbi: %s\n", zumbi1.getVida());
        player1.atacar(zumbi1); // vida 0 = morte
        System.out.printf("Vida do zumbi: %s\n", zumbi1.getVida());

        //testando movimento
        System.out.printf("Posicao do jogador2: %s\n", player2.getPosicao());
        player2.andar(DIRECAO.CIMA);
        player2.andar(DIRECAO.CIMA);
        player2.andar(DIRECAO.CIMA);
        player2.andar(DIRECAO.DIREITA);
        player2.andar(DIRECAO.DIREITA);
        player2.andar(DIRECAO.DIREITA);
        System.out.printf("Posicao do jogador2: %s\n", player2.getPosicao());

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