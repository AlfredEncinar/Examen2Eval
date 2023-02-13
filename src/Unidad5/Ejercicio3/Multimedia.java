package Unidad5.Ejercicio3;

public class Multimedia {

    private String titulo;
    private String autor;
    private String formato;
    private double duracion;

    public Multimedia(String titulo,String autor,String formato,double duracion) {

        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;

    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        String salida =
                "titulo=" + titulo + '\n' +
                        "autor=" + autor + '\n' +
                        "formato=" + formato + '\n' +
                        "duracion=" + duracion;
        return salida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Multimedia)) return false;
        Multimedia that = (Multimedia) o;
        return getTitulo().equals(that.getTitulo()) && getAutor().equals(that.getAutor());
    }




}