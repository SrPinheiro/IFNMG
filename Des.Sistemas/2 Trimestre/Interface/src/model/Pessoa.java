
package model;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String CPF;
    private LocalDate Nascimento;
    private Endereco endereco;

    public Pessoa(String nome, String CPF, LocalDate Nascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.Nascimento = Nascimento;
        this.endereco = endereco;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getNascimento() {
        return Nascimento;
    }

    public void setNascimento(LocalDate Nascimento) {
        this.Nascimento = Nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
