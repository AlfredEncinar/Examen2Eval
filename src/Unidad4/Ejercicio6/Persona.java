package Unidad4.Ejercicio6;

public class Persona {

    private String nombre;
    private String apellidos;


    public Persona(String nombre, String apellidos){

        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString(){

        return "Nombre completo: " + nombre + " " + apellidos;

    }

    public String getNombre(){

        return nombre;
    }
}