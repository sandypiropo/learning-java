package projetovideo;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totassistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totassistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistindo() {
        return totassistindo;
    }

    public void setTotassistindo(int totassistindo) {
        this.totassistindo = totassistindo;
    }

    @Override
    public String toString() {
        return "\nGafanhoto " + super.toString() +
                "\nlogin = " + login +
                "\ntotal assistido = " + totassistindo;
    }
}
