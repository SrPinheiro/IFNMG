package questao06;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private int quantidadeDeFilhos;
    private double salarioBase;

    Funcionario(String nome, String cpf, int quantidadeDeFilhos, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;

        if (quantidadeDeFilhos > 0) {
            this.quantidadeDeFilhos = quantidadeDeFilhos;
        }

        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        }

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return super.toString();
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

    public double getSalario() {
        return this.salarioBase + (this.quantidadeDeFilhos * 100);
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