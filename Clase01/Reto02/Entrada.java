package Reto02;

public class Entrada {

    //Atributos
    String evento;
    double precio;

    //Construtor
    public Entrada(){

    }

    public Entrada(String evento, double precio){
        this.evento= evento;
        this.precio= precio;
    }

    //Metodos
    public void mostrarInformacion(){
        System.out.println("Evento: " + evento + " | " + "Precio: " + precio);
    }



}
