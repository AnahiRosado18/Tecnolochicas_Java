import java.util.*;

public class RegistroMuestras {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> ordenLlegada = new ArrayList<>();
        ordenLlegada.add("Homo sapiens");
        ordenLlegada.add("Mus musculus");
        ordenLlegada.add("Arabidopsis thaliana");
        ordenLlegada.add("Homo sapiens"); // especie repetida

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(ordenLlegada);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idMuestraInvestigador = new HashMap<>();
        idMuestraInvestigador.put("M-001", "Dra. López");
        idMuestraInvestigador.put("M-002", "Dr. Hernández");
        idMuestraInvestigador.put("M-003", "Mtra. Ramírez");

        // Paso 4: Mostrar resultados

        // Lista ordenada de llegada
        System.out.println("📥 Orden de llegada de las muestras:");
        for (String especie : ordenLlegada) {
            System.out.println("🔬 " + especie);
        }

        // Especies únicas procesadas
        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("✅ " + especie);
        }

        // Relación ID → Investigador
        System.out.println("\n👩‍🔬 Relación ID de muestra → Investigador responsable:");
        for (Map.Entry<String, String> entrada : idMuestraInvestigador.entrySet()) {
            System.out.println("🧪 " + entrada.getKey() + " → " + entrada.getValue());
        }

        // Búsqueda por ID de muestra
        System.out.println("\n🔍 Búsqueda de investigador por ID de muestra:");
        String idBuscado = "M-002";
        if (idMuestraInvestigador.containsKey(idBuscado)) {
            System.out.println("🔎 " + idBuscado + " está asignado a: " + idMuestraInvestigador.get(idBuscado));
        } else {
            System.out.println("❌ No se encontró una muestra con el ID " + idBuscado);
        }
    }
}
