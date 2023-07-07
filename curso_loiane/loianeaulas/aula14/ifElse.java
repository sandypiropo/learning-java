package loianeaulas.aula14;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }

        // segundo exemplo
        System.out.print("Entre com o preço do item: ");
        double valor = sc.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor < 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }

    }
}
