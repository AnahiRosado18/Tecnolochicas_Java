package implementaciones;

import interfaces.TransicionHistoria;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void siguienteEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("➡ Avanzas hacia el castillo embrujado...");
        } else {
            System.out.println("➡ Tomas el camino hacia el bosque misterioso...");
        }
    }
}
