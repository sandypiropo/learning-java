package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    List<Moeda> listaMoedas;

    // criação da lista onde serão colocada as moedas
    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    // adiciona a moeda nova
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda adicionada ao cofrinho.");
    }

    // remove a moeda escolhida pelo usuario
    public void remover(Moeda moedaRemover) {
        if (listaMoedas.isEmpty()) {
            System.out.println("Não há moedas no cofrinho para remover.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : listaMoedas) {
                moeda.info();
            }

            System.out.println("Removendo moeda do cofrinho:");
            moedaRemover.info();

            listaMoedas.remove(moedaRemover);
            System.out.println("Moeda removida do cofrinho.");
        }
    }


    // lista de moedas incluidas no cofrinho pelo Menu
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("-------------------------");
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : listaMoedas) {
                moeda.info();
            }
        }
    }

    // retorna o total das moedas no cofrinho
    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}
