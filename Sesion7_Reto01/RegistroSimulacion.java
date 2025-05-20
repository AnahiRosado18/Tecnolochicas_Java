import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {
        // 1. Definir la carpeta y el archivo
        Path carpetaConfig = Paths.get("config");
        Path archivoParametros = carpetaConfig.resolve("parametros.txt");

        // 2. Contenido del archivo
        String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        try {
            // 3. Crear la carpeta si no existe
            if (!Files.exists(carpetaConfig)) {
                Files.createDirectory(carpetaConfig);
                System.out.println("📁 Carpeta 'config/' creada.");
            }

            // 4. Escribir el archivo
            Files.write(archivoParametros, contenido.getBytes());
            System.out.println("📝 Archivo 'parametros.txt' escrito correctamente.");

            // 5. Verificar existencia del archivo
            if (Files.exists(archivoParametros)) {
                System.out.println("✅ El archivo 'parametros.txt' existe.");

                // 6. Leer el contenido
                String lectura = Files.readString(archivoParametros);
                System.out.println("\n📄 Contenido del archivo:");
                System.out.println(lectura);
            } else {
                System.out.println("❌ El archivo no fue encontrado.");
            }

        } catch (IOException e) {
            System.out.println("❗ Error al procesar el archivo: " + e.getMessage());
        }
    }
}
