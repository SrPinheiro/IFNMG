
public class Livro {
    String titulo;
    int paginas;
    int publicacao;
    String autor;
    String editora;

    @Override
    public String toString() {
        StringBuilder etiqueta = new StringBuilder("");

        etiqueta.append(String.format("Titulo: %s\n", this.titulo));
        etiqueta.append(String.format("Autor: %s\n", this.autor));
        etiqueta.append(String.format("Publicacao: %s\n", this.publicacao));
        etiqueta.append(String.format("Paginas: %s\n", this.paginas));
        etiqueta.append(String.format("Editora: %s\n", this.editora));

        return etiqueta.toString();
    }
}
