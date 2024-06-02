import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        GerenciadorDeAlunos listaDeAlunos = new GerenciadorDeAlunos();


        boolean loop =  true;
        System.out.println("Bem vindo ao sistema de Gerenciamento de Alunos");

        while (loop == true) {
            System.out.println("1. Adicionar aluno\n" +
                    "2. Remover aluno\n" +
                    "3. Atualizar aluno\n" +
                    "4. Listar alunos\n" +
                    "5. Buscar aluno\n" +
                    "6. Sair");
            System.out.println("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Matricula: ");
                    String matriculaAdicionar = sc.next();
                    System.out.print("Ano escolar: ");
                    int anoEscolar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Data de nascimento (dd/MM/yyyy): ");
                    String dataNascimentoStr = sc.nextLine();

                    try {
                        Date dataNascimento = formatoData.parse(dataNascimentoStr);
                        Aluno aluno = new Aluno(nome,matriculaAdicionar, anoEscolar, dataNascimento);
                        listaDeAlunos.adicionarAlunos(aluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválida");
                    }
                    break;
                case 2:
                    System.out.println("Matricula do aluno a remover: ");
                    sc.nextLine();
                    String matriculaRemover = sc.nextLine();
                    Aluno alunoremovido = listaDeAlunos.removerAlunos(matriculaRemover);

                    if (alunoremovido != null) {
                        System.out.println("Aluno " + alunoremovido.getNome() + " de Matricula " + alunoremovido.getMatricula() + " Removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Matricula do aluno que vai atualizar: ");
                    String matriculaAtualizar = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Série nova: ");
                    int serieNova = sc.nextInt();
                    listaDeAlunos.atualizarAluno(matriculaAtualizar, serieNova);
                    break;
                case 4:

                    System.out.println("Lista de Alunos devidamente matriculados: ");
                    ArrayList<Aluno> alunos = listaDeAlunos.getAlunos();

                    if (!alunos.isEmpty()) {
                        System.out.println("...");
                        int index = 0;
                            for (Aluno aluno : alunos) {
                                System.out.println("Índice: " + index++ + ", Nome: " + aluno.getNome() +
                                        ", Matrícula: " + aluno.getMatricula() +
                                        ", Data de Nascimento: " + formatoData.format(aluno.getDataDeNascimento()) +
                                        ", Série: " + aluno.getAnoEscolar());
                            }
                         } else {
                        System.out.println("Nenhum aluno encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do aluno que você quer buscar");
                    sc.nextLine();
                    String nomeAluno = sc.nextLine();

                    ArrayList<Aluno> alunosPesquisa = listaDeAlunos.buscarAlunos(nomeAluno);

                    if (alunosPesquisa.isEmpty()) {
                        System.out.println("Nenhum aluno encontrado com o nome de " + nomeAluno);
                    } else {
                        System.out.println("Busca realizada");
                        int index = 0;
                        for (Aluno aluno : alunosPesquisa) {
                            System.out.println("Índice: " + index++ + ", Nome: " + aluno.getNome() +
                                    ", Matrícula: " + aluno.getMatricula() +
                                    ", Data de Nascimento: " + formatoData.format(aluno.getDataDeNascimento()) +
                                    ", Série: " + aluno.getAnoEscolar());
                        }
                    }
                    break;
                case 6:
                    loop = false;
                    System.out.println("Saindo...");
                    break;
            }
        }


    }
}