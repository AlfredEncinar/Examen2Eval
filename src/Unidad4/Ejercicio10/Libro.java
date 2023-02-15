package Unidad4.Ejercicio10;


public class Libro {


    private String titulo;
    private int numPags;


    public Libro(String titulo , int numPags) {

        this.titulo = titulo;
        this.numPags = numPags;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        String salida = "Titulo : " + this.titulo + " numero de paginas : " + this.numPags;
        return salida;
    }


}