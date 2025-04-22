package Sesion2_Reto02;

import java.util.Scanner;

public class CajeroAutomatico {
    private double saldo;
    private Scanner scanner;

    public CajeroAutomatico() {
        saldo = 1000.0;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> consultarSaldo();
                case 2 -> depositar();
                case 3 -> retirar();
                case 4 -> System.out.println("Gracias por usar el cajero automático. ¡Hasta pronto!");
                default -> System.out.println("Opción inválida. Por favor, elija una opción del 1 al 4.");
            }

        } while (opcion != 4);
    }

    private void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    private void depositar() {
        System.out.print("Ingrese el monto a depositar: ");
        double deposito = scanner.nextDouble();
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("⚠El monto debe ser mayor a 0.");
        }
    }

    private void retirar() {
        System.out.print("Ingrese el monto a retirar: ");
        double retiro = scanner.nextDouble();
        if (retiro > saldo) {
            System.out.println("Fondos insuficientes. Su saldo es: $" + saldo);
        } else if (retiro <= 0) {
            System.out.println(" El monto debe ser mayor a 0.");
        } else {
            saldo -= retiro;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }
}
