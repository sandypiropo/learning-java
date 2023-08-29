import java.util.HashMap;
import java.util.Map;

public class StudyMap {
    public static void main(String[] args) {

        Map<String, Integer> map;
        map = new HashMap<>();

        map.put("joao", 20);
        map.put(null, 50);
        if (!map.containsKey("joao")) {
            map.put("joao", null);
        } // Não substitui a chave joao por outra chave
        map.put("carlos", null);
        map.put("pedro", 55);

        print(map);
        //SAÍDA: Não mantém a ordem Hashmap
        //Chaves não aceita repetidas, Valores sim
    }

    private static void print(Map<String, Integer> item) {

        item.forEach((chave, valor) -> {
            System.out.println("chave:" + chave + ", valor: " + valor);
        });
    }
}
