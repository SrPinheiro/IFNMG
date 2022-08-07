package questao02;

public class Principal {
    public static void main(String[] args) {
        Cafeteira cafe1 = new Cafeteira("PoliShop");
        double[][] notas = new double[2][1];

        cafe1.addCafe();
        cafe1.addAgua();
        cafe1.beber();

    }
}

/*Construa uma classe que represente computacionalmente uma cafeteira. Adicione os seus atributos e comportamentos.
Lembre-se que, para fazer um café é preciso adicionar água e pó de café. Após ter bebido todo o café, é preciso
limpar e adicionar água novamente caso queria fazer um outro café. Construa o diagrama UML para a classe criada.*/
