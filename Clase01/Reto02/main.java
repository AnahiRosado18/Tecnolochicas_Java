package Reto02;

public class main {

    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Circo", 55.5);
        Entrada entrada3 = new Entrada("Cine", 80.0);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
    }
}
