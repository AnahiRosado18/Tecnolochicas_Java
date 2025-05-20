import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class TemarioColaborativo {
    public static void main(String[] args) {
        // Lista segura para múltiples hilos
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();

        // Agregamos temas
        temasActivos.add(new Tema("Lectura comprensiva", 2));
        temasActivos.add(new Tema("Matemáticas básicas", 1));
        temasActivos.add(new Tema("Cuidado del medio ambiente", 3));
        temasActivos.add(new Tema("Educación emocional", 1));
        temasActivos.add(new Tema("Tecnología en el aula", 2));

        // Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Educación emocional", "https://recursos.edu/emociones");
        recursos.put("Tecnología en el aula", "https://recursos.edu/tecnologia");

        // Mostrar orden alfabético
        System.out.println("📚 Temas ordenados alfabéticamente:");
        Collections.sort(temasActivos);  // Usa compareTo()
        for (Tema tema : temasActivos) {
            System.out.println("• " + tema);
        }

        System.out.println("\n🔢 Temas ordenados por prioridad:");
        // Orden por prioridad ascendente
        temasActivos.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema tema : temasActivos) {
            System.out.println("• " + tema);
        }

        System.out.println("\n📦 Repositorio de recursos compartidos:");
        for (String titulo : recursos.keySet()) {
            System.out.println("• " + titulo + " → " + recursos.get(titulo));
        }
    }
}
