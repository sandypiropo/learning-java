import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }

    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random random = new Random();
            System.out.println("Lutar!");
            int vencedor = random.nextInt(3);
            System.out.println("\nRESULTADO-------------------");
            switch (vencedor) {
                case 0: // EMPATE
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:  // GANHOU DESAFIADO
                    System.out.println("Vitoria do lutador " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // GANHOU DESAFIANTE
                    System.out.println("Vitoria do lutador " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
