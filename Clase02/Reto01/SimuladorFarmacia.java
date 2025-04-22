package Sesion2_Reto01;

import java.util.Scanner;

public class SimuladorFarmacia {
    //Atributos
    String NMedicamento;
    double PrecioUni;
    double TotalSinDescuento;
    boolean ApliDescuento;
    double Descuento;
    int CantidadPiezas;

    //Scanner
    Scanner scanner = new Scanner(System.in);

    //Métodos

    public void ingresoInfo(){
        System.out.println("Ingrese Nombre del Medicamento: ");
        NMedicamento = scanner.next();

        System.out.println("Ingrese Cantidad de Medicamento requerida: ");
        CantidadPiezas = scanner.nextInt();

        System.out.println("Ingrese precio unitario: ");
        PrecioUni = scanner.nextDouble();
    }

    public void calcularPrecio(){
        TotalSinDescuento = (CantidadPiezas * PrecioUni);
        ApliDescuento = (TotalSinDescuento > 500.00) ? true : false;
    }

    public void impresionCalculo(){
        Descuento = TotalSinDescuento * 0.15;

        var TotalDescuento = (TotalSinDescuento > 500.00) ?
                (TotalSinDescuento - Descuento ): TotalSinDescuento;

        System.out.println("-------------------------------------");
        System.out.println("Medicamento: " + NMedicamento + ".");
        System.out.println("Cantidad: " + CantidadPiezas + ".");
        System.out.println("Precio Unitario: $" + PrecioUni + ".");
        System.out.println("Total sin descuento: $" + TotalSinDescuento + ".");
        System.out.println("¿Aplica descuento?: " + ApliDescuento + ".");
        System.out.println("Descuento: $" + Descuento + ".");
        System.out.println("Total a Pagar: $" + TotalDescuento);
        System.out.println("-------------------------------------");

    }

}
