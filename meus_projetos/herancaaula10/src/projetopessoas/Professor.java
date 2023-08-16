package projetopessoas;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double aum) {
        this.salario += aum;
    }

    public Professor(String nome, int idade, String sexo, String especialidade) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor:\n" +
                "Nome = " + getNome() + "\n" +
                "Idade = " + getIdade() + "\n" +
                "Sexo = " + getSexo() + "\n" +
                "Especialidade = " + this.especialidade;
    }
}
