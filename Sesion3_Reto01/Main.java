package Sesion3_Reto01;

public class Main {
        public static void main(String[] args) {
            // Crear pasajero y vuelo
            Pasajero p1 = new Pasajero("Anahi Rosado", "P123456");
            Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

            // Reservar asiento
            if (vuelo1.reservarAsiento(p1)) {
                System.out.println("✅ Reserva realizada con éxito.\n");
            } else {
                System.out.println("❌ No se pudo realizar la reserva.\n");
            }

            // Mostrar itinerario
            System.out.println(vuelo1.obtenerItinerario() + "\n");

            // Cancelar la reserva
            System.out.println("❌ Cancelando reserva...\n");
            vuelo1.cancelarReserva();

            // Mostrar itinerario nuevamente
            System.out.println(vuelo1.obtenerItinerario() + "\n");

            // Reservar usando nombre y pasaporte
            vuelo1.reservarAsiento("Jorge Rio", "P987654");

            // Mostrar itinerario final
            System.out.println(vuelo1.obtenerItinerario());
        }

}

