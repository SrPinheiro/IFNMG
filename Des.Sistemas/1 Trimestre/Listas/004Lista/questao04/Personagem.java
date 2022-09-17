package questao04;

public class Personagem extends Entidade {

    Personagem(String nome) {
        super(nome, 100, 20, 5);
    }

    @Override
    public void setVida(int vida) {
        if (vida <= 100 && vida > 0) {
            super.setVida(vida);
        }
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