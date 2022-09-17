package questao07;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private final String CPF;
    private Date nascimento;
    private SEXO sexo;
    private final List<Carrinho> COMPRAS = new ArrayList<>();

    Cliente(String nome, String CPF, SEXO sexo) {
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.nascimento = new Date();
    }
    public boolean addCompra(Carrinho carrinho){
        if (carrinho.getQuantidadeProdutos() > 0){
            this.COMPRAS.add(carrinho);
            return true;
        }
        return false;
    }

    public void mostrarCompras(){
        for(Carrinho c: this.COMPRAS){
            c.mostrarCarrinho();
            System.out.println("");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return CPF;
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
}
/*
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA — JetBrains
 * Turma: Info 0121
 * IFNMG — Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 * Data:
 */