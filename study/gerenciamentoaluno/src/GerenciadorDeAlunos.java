import java.util.ArrayList;

public class GerenciadorDeAlunos {
    ArrayList<Aluno> alunos;

    public GerenciadorDeAlunos() {
        this.alunos = new ArrayList<>();
    }

    public GerenciadorDeAlunos(ArrayList<Aluno> alunos) {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno removerAlunos(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                return aluno;
            }
        }
        return null;
    }


    public boolean atualizarAluno(String matricula, int anoEscolar) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setAnoEscolar(anoEscolar);
                return true;
            }
        }
        return false;
    }


    public ArrayList<Aluno> buscarAlunos(String nome) {
        ArrayList<Aluno> alunosEncontrados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                alunosEncontrados.add(aluno);
            }
        }
        return alunosEncontrados;
    }
    public ArrayList<Aluno> getAlunos() {
        if (alunos != null) {
            return alunos;
        }
        return null;
    }

}
