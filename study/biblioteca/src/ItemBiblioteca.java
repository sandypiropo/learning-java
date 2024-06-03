public abstract class ItemBiblioteca {
    private String titulo;
    private int anoDePublicacao;

    public ItemBiblioteca(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }


    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }


}
