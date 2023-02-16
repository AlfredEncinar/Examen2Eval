package Unidad5.Ejercicio4;

public class Libros implements Prestable{
    private int codigo;
    private String titulo;
    private int anno;
    private boolean prestado;

    public Libros(int codigo, String titulo, int anno, boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anno = anno;
        this.prestado = prestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return " Libros " +
                " codigo = " + codigo +
                " , titulo = " + titulo +
                " , anno = " + anno +
                " , prestado = " + prestado;
    }
}
