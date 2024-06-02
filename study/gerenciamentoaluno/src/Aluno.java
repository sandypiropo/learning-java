import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private int anoEscolar;
    private Date dataDeNascimento;

    public Aluno() {

    }

    public Aluno(String nome, String matricula, int anoEscolar, Date dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoEscolar = anoEscolar;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(int anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anoEscolar=" + anoEscolar +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
