package questao02;

public class Cafeteira {
    private final String MARCA;
    private boolean agua;
    private boolean cafe;
    private boolean limpa;

    Cafeteira(String marca) {
        this.MARCA = marca;
        this.limpa = true;

    }

    public void beber() {
        this.setAgua(false);
        this.setCafe(false);
        System.out.println("bebendo...");
    }

    public void prepararCafe() {
        if (this.isLimpa()) {
            this.addAgua();
            this.addCafe();
        } else {
            System.out.println("Limpa a cafeteira antes de preparar o cafe!");
        }
    }

    public void limpar() {
        this.setAgua(false);
        this.setCafe(false);
        this.setLimpa(true);
        System.out.println("Cafeteira Limpa!");
    }

    private void addCafe() {
        this.setCafe(true);
        this.setLimpa(false);
        System.out.println("Cafe adicionado!");
    }

    private void addAgua() {
        this.agua = true;
        System.out.println("Agua adicionada!");
    }

    public String getMARCA() {
        return MARCA;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    public boolean isLimpa() {
        return limpa;
    }

    public void setLimpa(boolean limpa) {
        this.limpa = limpa;
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
