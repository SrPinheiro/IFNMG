public class Gato {
    String nome;
    int idade;
    String raca;
    String cor;
    private int andou;
    private int pular;

    // ignore a parte de baixo ^^

    Gato(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    void andar(){
        this.andou += 5;
        System.out.printf("%s andou %d metros\n",this.nome, this.andou);
    }

    void pular(){
        this.pular = (int) (1 + Math.random() * 5);
        System.out.printf("%s pulou %d metros de altura\n",this.nome, this.pular);
    }

}
