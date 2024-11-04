import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Diego");
        nomes.add("Victor");
        nomes.add("Daniela");

        // Exemplo 1
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------");
        
        // A partir do java 8
        // Exemplo 2 expressão lambda
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("-------------------------------");

        // Exemplo 3 com método de referência
        nomes.forEach(System.out::println);
    }
}
