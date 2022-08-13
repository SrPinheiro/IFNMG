package questao05;

public class Carro {
    private String modelo;
    private String cor;
    private String Placa;
    private int numeroDePortas;
    private Motor motor;

    public void ligar(){
        motor.ligar();
    }
    public void desligar(){
        motor.desligar();
    }
    public void acelerar(){
        motor.acelerar();
    }
}
