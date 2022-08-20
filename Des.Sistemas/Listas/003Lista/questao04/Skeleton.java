package questao04;

public class Skeleton extends Entidade {

    Skeleton() {
        super("Skeleton", 10, 5, 0);
    }

    @Override
    public void setVida(int vida) {
        //a vida do esqueleto nunca sera regenerada
        if (vida <= this.getVida()) {
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