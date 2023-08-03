package projetovideo;

public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 13 de POO guanabara");
        v[2] = new Video("Aula 1 de Python");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Ana", 14, "F", "aninha22");
        g[1] = new Gafanhoto("Pedro", 23, "M", "peubicha");

        Visualizacao vis[] = new Visualizacao[4];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[1], v[0]);
        vis[0].avaliar(100f);
        vis[2].avaliar(100f);

        System.out.println(vis[0].toString());

        //System.out.println(g[0].toString());

        //System.out.println(v[0].toString());
    }
}