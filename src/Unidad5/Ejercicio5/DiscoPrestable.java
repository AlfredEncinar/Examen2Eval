package Unidad5.Ejercicio5;

public class DiscoPrestable extends Disco implements Prestable{

    /**
     * Atributo especifico de la clase.
     */
    private boolean prestado;


    public DiscoPrestable(String titulo, String autor, Formato formato, Double duracion, Genero genero, boolean prestado) {
        super(titulo, autor, formato, duracion, genero);
        this.prestado = prestado;
    }

    /**
     * metodos
     * @return
     */
    @Override
    public boolean prestado() {

        return prestado;
    }

    /**
     *
     * @return
     */


    @Override
    public String toString() {

        String salida;
        salida = super.toString() + "\nPrestado: " + prestado + "\n";

        return salida;

    }


}
