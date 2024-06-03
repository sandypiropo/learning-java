public class Livro extends ItemBiblioteca implements Emprestavel{
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean emprestado;

    public Livro(String titulo, int anoDePublicacao, String autor, String ISBN, int numeroPaginas) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        this.emprestado = true;
    }

    @Override
    public void devolver() {
        this.emprestado = false;
    }

    @Override
    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void exibirInformacoes() {
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
