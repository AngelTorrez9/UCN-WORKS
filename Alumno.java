package Herencia;

public class Alumno extends Persona {
    private String matricula;

    public Alumno(String nombre, String apellido, String f_nacimiento, String matricula) {
        super(nombre, apellido, f_nacimiento);  // Llamada al constructor de la clase padre
        this.matricula = matricula;
    }

    public void estudiar() {
        System.out.println("Estoy estudiando con matricula " + this.matricula);
    }
}
