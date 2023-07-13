package casa;

public class Principal {
    public static void main(String[] args) {

        Computador computador1 = new Computador();
        computador1.cor = "Branco";
        computador1.tela = 21.5;
        computador1.modelo = "Philips";
        computador1.ligado = true;
        computador1.status();
        computador1.internet();
        computador1.jogos();

        System.out.println();

        Computador computador2 = new Computador("Preto", 25.5, "Samsung", false);
        computador2.status();
        computador2.internet();
        computador2.jogos();
    }
}
