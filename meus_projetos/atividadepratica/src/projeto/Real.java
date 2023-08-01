package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

public class Real extends Moeda {
    public Real(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real");
        System.out.println("Valor: " + valor + " reais");
    }

    @Override
    public double converter() {
        // O Real já está na moeda base, portanto não coloquei conversão
        return valor;
    }
}
