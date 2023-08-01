package projeto;

//Projeto feito para a atividade prática Uninter

//ALUNA: SANDY OLIVEIRA SANTOS PIROPO
//RU: 4368203

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu para o usuário enquanto o comando sair não é chamado
        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda(cofrinho, scanner);
                    break;
                case 2:
                    removerMoeda(cofrinho, scanner);
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    double totalConvertido = cofrinho.totalConvertido();
                    System.out.println("Total convertido para reais: " + totalConvertido);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("=========== MENU ===========");
        System.out.println("1. Adicionar moeda ao cofrinho");
        System.out.println("2. Remover moeda do cofrinho");
        System.out.println("3. Listar moedas no cofrinho");
        System.out.println("4. Calcular total convertido para reais");
        System.out.println("5. Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    // MENU de escolha. para deixar o código mais fluído ao acessar as diferentes classes
    public static void adicionarMoeda(Cofrinho cofrinho, Scanner scanner) {
        System.out.println("-------------------------");
        System.out.println("Escolha a moeda a ser adicionada:");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        System.out.println("4. Libra");
        System.out.print("Opção: ");
        int opcaoMoeda = scanner.nextInt();

        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        Moeda moeda;

        switch (opcaoMoeda) {
            case 1:
                moeda = new Dolar(valor);
                break;
            case 2:
                moeda = new Euro(valor);
                break;
            case 3:
                moeda = new Real(valor);
                break;
            case 4:
                moeda = new Libra(valor);
                break;
            default:
                System.out.println("Opção inválida. Moeda não adicionada.");
                System.out.println("-------------------------");
                return;
        }

        cofrinho.adicionar(moeda); // Permite que o usuário adicione uma moeda ao cofrinho

    }

    // Permite que o usuário remova uma moeda do cofrinho
    public static void removerMoeda(Cofrinho cofrinho, Scanner scanner) {
        System.out.println("-------------------------");
        System.out.print("Digite o valor da moeda a ser removida: ");
        double valor = scanner.nextDouble();

        Moeda moedaRemover = null;

        if (cofrinho.listaMoedas.isEmpty()) {
            System.out.println("Não há moedas no cofrinho para remover.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : cofrinho.listaMoedas) {
                moeda.info();
            }

            for (Moeda moeda : cofrinho.listaMoedas) {
                if (moeda.valor == valor) {
                    moedaRemover = moeda;
                    break;
                }
            }

            if (moedaRemover != null) {
                System.out.println("Removendo moeda do cofrinho:");
                moedaRemover.info();

                cofrinho.listaMoedas.remove(moedaRemover);
                System.out.println("Moeda removida do cofrinho.");
            } else {
                System.out.println("Moeda não encontrada no cofrinho.");
            }
        }

        System.out.println("-------------------------");
    }

}

