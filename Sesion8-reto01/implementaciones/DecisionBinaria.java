package implementaciones;

import interfaces.LogicaDecision;
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("👉 Elige tu camino (A: castillo / B: bosque): ");
        return scanner.nextLine().trim().toUpperCase();
    }
}
