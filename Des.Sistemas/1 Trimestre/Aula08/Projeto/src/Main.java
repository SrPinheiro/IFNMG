class Main{
    public static void main(String[] args) {
        Carro ferrari = new Carro("Preto", "Ferrrari", 50);
        Gato larissa = new Gato("Larissa", 17, "moreninha");

        System.out.println("-----------------------Carro---------------------------");
        System.out.println(ferrari.cor);
        System.out.println(ferrari.marca);
        System.out.println(ferrari.kmRodados);
        System.out.println(ferrari.litrosCombustivel);
        System.out.println(ferrari.velocidadeMax);

        System.out.println("-----------------------Gato---------------------------");
        System.out.println(larissa.nome);
        System.out.println(larissa.idade);
        System.out.println(larissa.raca);
        System.out.println(larissa.cor);

        System.out.println("-----------------------Metodos Gato---------------------");
        larissa.andar();
        larissa.andar();
        larissa.andar();
        larissa.pular();
        larissa.pular();
        larissa.pular();
    }
}