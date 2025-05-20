import interfaces.TransicionHistoria;
import interfaces.GestorDialogo;
import interfaces.LogicaDecision;
import implementaciones.TransicionSimple;
import implementaciones.DialogoTexto;
import implementaciones.DecisionBinaria;

public class MainNarrativa {
    public static void main(String[] args) {
        // Inyección de dependencias (DIP)
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        // Flujo narrativo
        dialogo.mostrarDialogo("Te encuentras frente a dos caminos en la encrucijada...");
        String eleccion = decision.tomarDecision();
        dialogo.mostrarDialogo("Has elegido la opción: " + eleccion);
        transicion.siguienteEscena(eleccion);
    }
}
