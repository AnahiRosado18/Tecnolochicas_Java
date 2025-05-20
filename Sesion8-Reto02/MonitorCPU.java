import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> registrosCPU = new HashSet<>();
        boolean continuar = true;

        System.out.println("🖥️ Monitor de Consumo de CPU por Servidor");

        try {
            while (continuar) {
                System.out.print("🔢 Ingresa consumo de CPU (%), o escribe 'salir': ");
                String entrada = scanner.nextLine().trim();

                if (entrada.equalsIgnoreCase("salir")) {
                    continuar = false;
                    continue;
                }

                double valorCPU;
                try {
                    valorCPU = Double.parseDouble(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingresa un número válido.");
                    continue;
                }

                if (valorCPU < 0 || valorCPU > 100) {
                    System.out.println("❌ Error: El valor debe estar entre 0 y 100.");
                    continue;
                }

                if (registrosCPU.contains(valorCPU)) {
                    System.out.println("⚠️ Advertencia: Valor duplicado no registrado.");
                    continue;
                }

                if (valorCPU > 95) {
                    throw new ConsumoCriticoException(valorCPU);
                }

                registrosCPU.add(valorCPU);
                System.out.println("✅ Registro agregado: " + valorCPU + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("📊 Monitoreo finalizado. Registros únicos: " + registrosCPU.size());
        }
    }
}
