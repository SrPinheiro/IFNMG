
package Atividade01;

class Aluno {
    private String nome;
    private long matricula;
    private Double[] notaProva = new Double[3];
    private double notaTrabalho;

    Aluno(){
        this.matricula = (int) (999999999999L + Math.random() * 99999999999999999L);
    }

    public void setNotaProva(double nota1, double nota2, double nota3){
        if(nota1 > 0 && nota2 > 0 && nota3 > 0){
            this.notaProva[0] = nota1;
            this.notaProva[1] = nota2;
            this.notaProva[2] = nota3;
        }
    }

    public void setNotaTrabalho(double nota){
        if(nota > 0){
            this.notaTrabalho = nota;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNotaFinal(){
        double resultado = (this.notaProva[0] * 2) + (this.notaProva[1] * 2) + (this.notaProva[2] * 2) + (this.notaTrabalho * 1.5);
        return resultado / (2+2+2+1.5);
    }


    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public Double[] getNotaProva() {
        return notaProva;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }


}
