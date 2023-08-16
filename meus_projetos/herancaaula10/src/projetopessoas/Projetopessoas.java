package projetopessoas;

public class Projetopessoas {
    public static void main(String[] args) {
        //programa principal

        Pessoa p1 = new Pessoa("Evelyn", 79, "F");
        Aluno p2 = new Aluno("Celia", 69, "F", 1001, "Atriz");
        Professor p3 = new Professor("Harry", 60, "M", "Empresario");
        Funcionario p4 = new Funcionario("John", 50, "M", "Fama");

        p2.setNome("Celia");
        p2.setSexo("F");
        p2.setIdade(69);
        p2.setCurso("Atriz");
        p2.setMatricula(1001);

        p3.setSalario(20500);

        //p4.mudarTrabalho();

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);
        System.out.println();
        System.out.println(p4);

    }
}
