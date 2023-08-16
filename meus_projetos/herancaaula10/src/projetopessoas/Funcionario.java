package projetopessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; //recebe o inverso
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = true;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        String statusTrabalhando = (trabalhando) ? "true" : "false";

        return "Funcionário:\n" +
                "Nome = " + getNome() + "\n" +
                "Idade = " + getIdade() + "\n" +
                "Sexo = " + getSexo() + "\n" +
                "Setor = " + this.setor + "\n" +
                "Trabalhando? = " + statusTrabalhando;
    }
}
