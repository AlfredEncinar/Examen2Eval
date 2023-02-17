package Unidad5.Ejercicio4;

public class Revistas extends Biblioteca {

    private int numero;

    public Revistas(int codigo, String titulo, int annoPublicacion,int numero) {

        super(codigo, titulo, annoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Esto es una revista. \n" + super.toString() + "\nRevista numero: " + numero + "\n";

    }
}
