package questao03;

public class Principal {
    public static void main(String[] args) {
        Carro caro1 = new Carro("Ferrari", 400);

        System.out.println("=====================================");
        System.out.printf("Marca: %s\n",caro1.getMARCA());
        System.out.printf("VelocidadeMAX: %s\n", caro1.getVELOCIDADEMAX());
        System.out.printf("Potencia: %.2f\n", caro1.getPOTENCIA() );
        System.out.println("=====================================");

        caro1.girarChave();

        System.out.printf("Velocidade: %s\n", caro1.getVelocidade());
        caro1.acelerar();
        System.out.printf("Velocidade: %s\n", caro1.getVelocidade());
        caro1.acelerar();
        System.out.printf("Velocidade: %s\n", caro1.getVelocidade());
        caro1.acelerar();
        System.out.printf("Velocidade: %s\n", caro1.getVelocidade());
        caro1.acelerar();
        System.out.printf("Velocidade: %s\n", caro1.getVelocidade());
        caro1.frear();
        System.out.printf("Velocidade: %s\n", caro1.getVelocidade());

        caro1.girarChave();

    }
}
