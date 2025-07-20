package Herencia;

public class Persona {
    private String nombre;
    private String apellido; 
    private String f_nacimiento;

    public Persona(String nombre, String apellido, String f_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.f_nacimiento = f_nacimiento;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + this.apellido);
        System.out.println("Naci el " + this.f_nacimiento);
    }
}
