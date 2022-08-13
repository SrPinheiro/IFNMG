package questao06;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private int quantidadeDeFilhos;
    private double salarioBase;

    Funcionario(String nome, String cpf, int quantidadeDeFilhos, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.quantidadeDeFilhos = quantidadeDeFilhos;
        this.salarioBase = salarioBase;

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

    public int getQuantidadeDeFilhos() {
        return quantidadeDeFilhos;
    }

    public void setQuantidadeDeFilhos(int quantidadeDeFilhos) {
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalario(){
        return this.salarioBase + (this.quantidadeDeFilhos * 100);
    }
}
