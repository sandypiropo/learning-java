package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

public abstract class Moeda {
    protected double valor;

    // retorna as informações das moedas selecionadas
    public abstract void info();

    // método que converte o valor das moedas (caso necessário)
    public abstract double converter();
}
