package Unidad4.Ejercicio6;

//Crea una clase Libro que modele la infomación que
// se mantiene en una biblioteca sobre cada libro:
// título, autor (usa la clase Persona),
// ISBN, páginas, edición, editorial, lugar
// (ciudad y país) y fecha de edición
// (usa la clase Fecha).
// La clase debe proporcionar los siguientes servicios:
// getters y setters, método para leer la información
// y método para mostrar la información.
// Este último método mostrará la información del
// libro con el siguiente formato:
//
//
//Título: Introduction to Java Programming
//3ª ecición
//Autor: Liang, Y. Daniel
//ISBN: 0-13-031997-X
//Prentice-Hall, New Jersey (USA),
// viernes 16 de noviembre de 2001
//784 páginas


public class Libro {


    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private String edicion;
    private String editorial;
    private String lugar;
    private Fecha fecha;

    public Libro(String titulo ,String edicion , Persona autor , int isbn , int paginas , String editorial , String lugar , Fecha fecha){

        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;

        this.editorial = editorial;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getEdicion(){
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getIsbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }


    public void mostrarInfirmacion(){
        System.out.println("Titulo : " + titulo);
        System.out.println(edicion + " edición");
        System.out.println("Autor : " + autor);
        System.out.println("ISBN : " + isbn);
        System.out.println(edicion + " , " + lugar + " , " + fecha);
        System.out.println(paginas + " páginas");

    }

}