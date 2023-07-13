package casa;

public class Computador {
    String cor;
    double tela;
    String modelo;
    boolean ligado;

    public Computador() {

    }
    public Computador(String cor, double tela, String modelo, boolean ligado) {
        this.cor = cor;
        this.tela = tela;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    void status() {
        System.out.println("Cor do computador: " + this.cor);
        System.out.println("Tamanho da tela: " + this.tela);
        System.out.println("Marca da tela: " + this.modelo);
        System.out.println("Esta ligado?: " + ligado);
    }

    void internet() {
        if(this.ligado == true){
            System.out.println("Internet ligada, pode usar");
        } else {
            System.out.println("Sem internet");
        }
    }

    void jogos() {
        if(this.ligado == true){
            System.out.println("Pode jogar");
        } else {
            System.out.println("Ligue o PC para poder jogar");
        }
    }

}
