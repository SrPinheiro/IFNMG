package questao03;

import java.util.Date;

public class Autor {
    String nome;
    Date nascimento;

    Autor(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
