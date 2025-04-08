package Reto01;

import java.util.Scanner;

public class Paciente {

    //Atributos
    String nombre;
    int edad;
    String NExpediente;

    //Declaracion escaner
    Scanner scanner = new Scanner(System.in);

    //Metodos

    public void pedirInformacion(){
        System.out.println("Ingrese nombre del paciente: ");
        nombre= scanner.next();

        System.out.println("Ingrese edad del paciente: ");
        edad = scanner.nextInt();

        System.out.println("Ingrese Numero del Paciente: ");
        NExpediente = scanner.next();
    }

    public void mostrarInforacion(){
        System.out.println("--------------------------------------------------");
        System.out.println("Registro del Paciente");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Expediente: " + NExpediente);

    }



}
