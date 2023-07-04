package loianeaulas.aula12;

import java.util.Scanner;

public class leituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é = " + idade);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Primeiro nome = " + primeiroNome);

        scan.nextLine(); // Consumir o caractere de nova linha pendente

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Altura = " + altura);

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem pets: ");
        String pNome = scan.next();
        int idade2 = scan.nextInt();
        byte qtdfilhos = scan.nextByte();
        float altura2 = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("RESULTADOS:");
        System.out.println("Nome: " + pNome);
        System.out.println("Quantidade de filhos: " + qtdfilhos);
        System.out.println("Idade: " + idade2);
        System.out.println("Altura: " + altura2);
        System.out.println("Pets?: " + temPet);
        scan.close();
    }
}

