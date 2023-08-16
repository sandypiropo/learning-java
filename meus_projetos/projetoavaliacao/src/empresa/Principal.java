package empresa;

public class Principal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Mario","Encanador",new Avaliacao(9,10,3));
        Aluno a2 = new Aluno("Luigi","Encanador",new Avaliacao(4,1,10));

        a1.info();
        a2.info();

    }
}


// teste feito para o ex01 na aula pratica 2 POO

      /*  Avaliacao luigi = new Avaliacao();
        Avaliacao mario = new Avaliacao(7, 4, 10);
        luigi.n1=8;
        luigi.n2=3;
        luigi.n3=7.5;

        System.out.println("Media Aritmetica do Mario: " + mario.mediaAritmetica());
        System.out.println("Media Ponderada do Mario: " + mario.mediaPonderada());

        System.out.println("Media Aritmetica do Mario: " + luigi.mediaAritmetica());
        System.out.println("Media Ponderada do Mario: " + luigi.mediaPonderada());
*/