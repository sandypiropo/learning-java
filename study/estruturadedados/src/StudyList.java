import java.util.ArrayList;
import java.util.List;

public class StudyList {
    public static void main(String[] args) {

        List<Integer> lista;
        lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(null);
        lista.add(null);
        lista.add(1);

        print(lista);

        //SAÍDA: Todos os items adicionados pelo método
    }

    private static void print(List<Integer> item) {
        for (int i = 0 ; i < item.size(); i++) {
            System.out.println(item.get(i));
        }
    }
}
