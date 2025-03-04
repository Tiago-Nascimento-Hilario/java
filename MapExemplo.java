import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, " carro");
        mapa.put(2, " moto");

        System.out.println(mapa.get(1));
    }
}
