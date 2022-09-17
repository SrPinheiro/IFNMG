package questao03;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro();

        Editora E1 = new Editora();

        Autor a1 = new Autor("Ana julia");

        E1.nome = "Lari's world";

        l1.autor = a1;
        l1.paginas = 300;
        l1.publicacao = 2005;
        l1.titulo = "Duquesa";
        l1.editora = E1;

        System.out.println(l1);

    }
}
