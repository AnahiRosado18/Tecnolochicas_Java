import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String rutaArchivoLog = "errores.log";
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        // Leer el archivo con try-with-resources
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivoLog))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resumen
            System.out.println("📋 Resumen del análisis de logs:");
            System.out.println("➡ Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Errores encontrados: " + errores);
            System.out.println("⚠️ Advertencias encontradas: " + advertencias);

            double porcentaje = totalLineas > 0
                    ? ((double)(errores + advertencias) / totalLineas) * 100
                    : 0;
            System.out.printf("📊 Porcentaje de líneas con errores/advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.out.println("❗ Error al procesar el archivo: " + e.getMessage());

            // Guardar mensaje en registro_fallos.txt
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter("registro_fallos.txt"))) {
                escritor.write("Error al analizar el archivo de logs: " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("⚠️ No se pudo escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
