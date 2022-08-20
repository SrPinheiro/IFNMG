package questao04;

public abstract class Entidade {
    private final String nome;
    private int vida;
    private int forca;
    private int defesa;
    private int x;
    private int y;


    Entidade(String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
    }

    public void Informacoes() {
        System.out.println("=================================================");
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Vida: %s\n", this.getVida());
        System.out.printf("Forca: %s\n", this.getForca());
        System.out.printf("Defesa: %s\n", this.getDefesa());
        System.out.printf("Posicao: %s\n", this.getPosicao());
        System.out.println("=================================================");
    }

    public void andar(DIRECAO direcao) {
        if (this.getVida() > 0) {
            switch (direcao) {
                case CIMA:
                    this.y += 1;
                    break;
                case BAIXO:
                    this.y -= 1;
                    break;
                case DIREITA:
                    this.x += 1;
                    break;
                case ESQUERDA:
                    this.x -= 1;
            }
        }
    }

    public void atacar(Entidade alvo) {
        if (this.getVida() > 0 && alvo.getVida() > 0) {
            if(this.getForca() - alvo.getDefesa() > 0){
                alvo.setVida((int) alvo.getVida() - (this.getForca() - alvo.getDefesa()));
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getPosicao() {
        return this.getX() + "," + this.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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