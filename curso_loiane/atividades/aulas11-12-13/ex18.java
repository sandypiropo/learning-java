import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo em MB:");
        double MB = scan.nextDouble();

        System.out.println("Velocidade da internet em Mbps:");
        double net = scan.nextDouble();

        double tempo = MB * 8 / net; // Calcula o tempo em segundos

        System.out.println("Tempo necessário para baixar o arquivo:");
        System.out.println("Segundos: " + tempo);

        scan.close();
    }
}