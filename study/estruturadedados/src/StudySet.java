import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudySet {
    public static void main(String[] args) {

        Set<Integer> set;
        set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(null);
        set.add(null);
        set.add(1);

        print(set);
    }

    private static void print(Set<Integer> item) {

        Iterator<Integer> iterator = item.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // SAÍDA:
    // null
    // 1
    // 3
    // ele nao repete items
    // nao respeita a ordem
}
