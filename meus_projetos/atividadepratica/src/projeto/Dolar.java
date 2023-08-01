package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

public class Dolar extends Moeda {
    public Dolar(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dólar");
        System.out.println("Valor: " + valor + " dólares");
    }

    @Override
    public double converter() {
        // seguindo a lógica de conversão do dólar para o Real
        return valor * 5.3; // Exemplo de conversão fixa = (1 dólar = 5.3 reais)
    }
}
