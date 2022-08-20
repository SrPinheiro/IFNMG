package questao08;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private boolean aluno;
    private Conta conta;
    //private List<Conta> contas = new ArrayList<>();


    Cliente(String nome, String cpf, boolean aluno) {
        this.nome = nome;
        this.cpf = cpf;
        this.aluno = aluno;
        this.conta = new Conta();
    }


    public boolean isAluno() {
        return this.aluno;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Conta getConta() {
        return this.conta;
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