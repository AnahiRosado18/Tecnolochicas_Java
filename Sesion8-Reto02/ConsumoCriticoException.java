public class ConsumoCriticoException extends Exception {
    public ConsumoCriticoException(double valor) {
        super("⚠️ ¡Alerta crítica! El servidor superó el umbral de CPU con: " + valor + "%");
    }
}
