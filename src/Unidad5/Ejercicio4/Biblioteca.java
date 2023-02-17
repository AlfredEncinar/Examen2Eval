package Unidad5.Ejercicio4;

public class Biblioteca {

    /**
     * Atributos que se le pasan a la super clase.
     */

    private int codigo;
    private String titulo;
    private int annoPublicacion;

    /**
     * Constructor.
     */

    public Biblioteca(int codigo, String titulo, int annoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
    }

    /**
     * Getters.
     */

    public int getCodigo() {
        return codigo;
    }


    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    /**
     * Override.
     */

    @Override
    public String toString() {

        return
                "codigo: " + codigo +
                "\ntitulo: " + titulo +
                "\naño de publicación: " + annoPublicacion;
    }
}


