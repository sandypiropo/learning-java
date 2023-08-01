package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

public class Libra extends Moeda {
    public Libra(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Moeda: Libra");
        System.out.println("Valor: " + valor + " libras");
    }

    @Override
    public double converter() {
        // seguindo a lógica de conversão da libra para o Real
        return valor * 7.5; // Exemplo de conversão fixa = (1 libra = 7.5 reais)
    }
}