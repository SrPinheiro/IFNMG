/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author ifnmg
 */
public class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private String turma;

    public Aluno(String matricula, Curso curso, String turma, String nome, String CPF, LocalDate Nascimento, Endereco endereco) {
        super(nome, CPF, Nascimento, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.turma = turma;
    }
    
    
    
}
