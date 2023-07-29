public class Main {
    public static void main(String[] args) {

    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("Pedro", 22, "M");
    p[1] = new Pessoa("Luiza", 21, "F");

    l[0] = new Livro("Javeiros", "José", 300, p[0]);
    l[1] = new Livro("POO", "Guanabara", 200, p[1]);
    l[2] = new Livro("Avançado", "Maria", 150, p[0]);

    System.out.println(l[0].detalhes());

    l[0].abrir();
    l[0].folhear(200);

        System.out.println(l[0].detalhes());
    }
}