package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

public class Euro extends Moeda {
    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro");
        System.out.println("Valor: " + valor + " euros");
    }

    @Override
    public double converter() {
        // seguindo a lógica de conversão do euro para o Real
        return valor * 6.2; // Exemplo de conversão fixa = (1 euro = 6.2 reais)
    }
}
