package Unidad5.Ejercicio5;

//Calcula e imprime por pantalla cuántos están prestados utilizando el método cuentaPrestados(). Si lo prefieres puedes modifciar las
// clases del ejercicio 1 para que todo esto se integre en esa aplicación.
public class Disco {

    /***
     * Atributos de la super clase
     */

    private String titulo;
    private String autor;
    private Formato formato;
    private Double duracion;
    private Genero genero;

    /***
     *Constructor
     * @param titulo
     * @param autor
     * @param formato
     * @param duracion
     * @param genero
     */

    public Disco(String titulo, String autor, Formato formato, Double duracion,Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        this.genero = genero;
    }

    /**
     * toString
     * @return
     */

    @Override
    public String toString() {

        String salida;
        salida = "\nEsto es un Disco. El Disco es: " + "\ntitulo: " + titulo + "\nautor: " + autor + "\nFormato: " + formato + "\nDuracion: " + duracion + "\nGenero: " + genero;

        return salida;

    }
}