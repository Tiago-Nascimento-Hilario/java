import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
    public static void main(String[] args) {
        List<String> listaDeNomes  = new ArrayList<>();
        listaDeNomes.add("Olavo");
        listaDeNomes.add("Perla");
        listaDeNomes.add("Ana");

        System.out.println(listaDeNomes);
        listaDeNomes.remove("Olavo");
        System.out.println(listaDeNomes);
        System.out.println(listaDeNomes.contains("Ana"));
        listaDeNomes.clear();
        System.out.println(listaDeNomes);



    }
}
