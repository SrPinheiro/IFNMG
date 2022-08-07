package questao01;

public class Produto {
    String nome;
    double volume;

    Produto(String nome, double volume){
        this.nome = nome;
        if (volume > 0) {
            this.volume = volume;
        }else{
            throw new RuntimeException("Volume invalido!");
        }
    }
}
