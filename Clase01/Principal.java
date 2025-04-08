package Clase01;

public class Principal {

    public static void main(String[] args) {
        //Crear mis objetos
        //1. Clase
        //2. Identificador
        //3. new + constructor

        Estudiante primerEstudiante = new Estudiante();

        primerEstudiante.Nombre = "Anahi";
        primerEstudiante.Edad = 21;

        primerEstudiante.saludar();

     }
}
