/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ifnmg
 */
public class Curso {
    private final long ID;
    private String nome;
    private final String CARGA_HORARIA;

    public Curso(long ID, String nome, String CARGA_HORARIA) {
        this.ID = ID;
        this.nome = nome;
        this.CARGA_HORARIA = CARGA_HORARIA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
