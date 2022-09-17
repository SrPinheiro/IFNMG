package Atividade01;
/*

Crie uma classe para representar alunos matriculados em uma determinada disciplina. Cada objeto deve armazenar o nome do aluno, sua matrícula, 3 notas de provas e 1 nota de um trabalho.

    Construa um método para calcular e retornar a média final do aluno, cada prova tem peso 2 e o trabalho peso 1,5.

*/
public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setNome("Leonardo");
        a1.setNotaProva(12,5,9);
        a1.setNotaTrabalho(8);

        System.out.printf("%.2f%n", a1.getNotaFinal());
    }
}
