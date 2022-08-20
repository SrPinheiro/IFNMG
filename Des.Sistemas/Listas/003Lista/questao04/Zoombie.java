package questao04;

public class Zoombie extends Entidade {

    Zoombie() {
        super("Zoombie", 30, 10, 5);
    }

    @Override
    public void setVida(int vida) {
        //a vida do zombie nunca sera regenerada
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