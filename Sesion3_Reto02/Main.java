package Sesion3_Reto02;

public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(200.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura f2 = new Factura(800.0, "Reparación de equipo", null);

        System.out.println(f1.getResumen() + "\n");
        System.out.println(f2.getResumen());
    }
}
