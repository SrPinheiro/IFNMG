package questao05;

public class Motor {
    private int quantidadedeCilindros;
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
        System.out.println("Carro ligado");
    }

    public void desligar(){
        this.ligado = false;
        System.out.println("Carro Desligado!");
    }

    public void acelerar(){
        System.out.println("Acelerando!!");
    }
}
