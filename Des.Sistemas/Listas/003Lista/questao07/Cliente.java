package questao07;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private Date nascimento;
    private SEXO sexo;

    private final List<Carrinho> carrinho = new ArrayList<>();

    Cliente(String nome, String cpf, SEXO sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nascimento = new Date();

    }
    public void addCompra(){
        this.carrinho.add(new Carrinho(this));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;

    }


    public List getCompras(){
        return this.carrinho;
    }
}
