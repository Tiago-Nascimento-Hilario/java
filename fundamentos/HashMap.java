import java.util.Map;


public class HashMap {
    public static void main(String[] args) {
        
        Map<String, Integer> notas = new java.util.HashMap<>();

        notas.put("Dado", 10);
        notas.put("Leo", 7);
        notas.put("Atonela", 80);

        var nota = notas.get("Dado");
        System.out.println(nota);
    }
}
