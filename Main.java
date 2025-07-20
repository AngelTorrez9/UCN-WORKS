package Herencia;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan ","De Leon ", "19/04/1932 ");
        Persona persona2 = new Persona("Abigail ", "Meza ", "12/06/1935 ");


        persona1.saludar(); 
        persona2.saludar(); 

        Alumno alumno1 = new Alumno("Pedro", " Gutierrez ", "15/05/1995 ", "12345");
        alumno1.saludar(); 
        alumno1.estudiar(); 

    }
}
