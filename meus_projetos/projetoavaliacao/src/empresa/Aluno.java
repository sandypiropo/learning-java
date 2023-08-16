package empresa;

public class Aluno {
    String nome;
    String curso;
    Avaliacao notas;

    public Aluno(String nome, String curso, Avaliacao notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    } // construtor

    void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Media A: " + notas.mediaAritmetica());
        System.out.println("Media P: " + notas.mediaPonderada());
    } // metoodo info
}
