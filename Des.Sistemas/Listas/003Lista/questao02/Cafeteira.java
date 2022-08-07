package questao02;

public class Cafeteira {
    private final String MARCA;
    private boolean agua;
    private boolean cafe;

    Cafeteira(String marca){
        this.MARCA = marca;

    }

    public void beber(){
        this.agua = false;
        this.cafe = false;
        System.out.println("bebendo...");
        this.limpar();
    }
    public void addCafe(){
        this.cafe = true;
        System.out.println("Cafe adicionado!");
    }

    public void addAgua(){
        this.agua = true;
        System.out.println("Agua adicionada!");
    }
    public void limpar(){
        this.agua = false;
        this.cafe = false;
        System.out.println("Cafeteira Limpa!");
    }

}


