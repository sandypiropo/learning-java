import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dataEmprestimo = df.parse("03/06/2024");
            Date dataDevolucao = df.parse("06/06/2024");
            Livro livro1 = new Livro("Titulo", 1928, "rOBERTO", "123", 230);
            Usuario usuario1 = new Usuario("Pedro Boas", "pedro@gmail.com", "7182873727");
            Emprestimo emprestimo = new Emprestimo(livro1, usuario1, dataEmprestimo, dataDevolucao);

            livro1.emprestar();
            livro1.exibirInformacoes();
            livro1.devolver();
            livro1.exibirInformacoes();

            System.out.println(emprestimo.toString());

        } catch (ParseException e) {
            System.out.println("Erro");

        }
    }
}