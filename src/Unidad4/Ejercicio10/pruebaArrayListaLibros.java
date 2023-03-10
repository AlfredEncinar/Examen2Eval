package Unidad4.Ejercicio10;

//Vamos a realizar una versión mejorada del ejercicio 9 utilizando las clases e interfaces de las que disponemos.
// Utilizaremos la clase Libro y todas las demás necesarias
// (si estás trabajando en el mismo proyecto puedes acceder a ellas. Si no haz una copia en tú proyecto).
// Vamos a modificar la clase lista de Libros,
// que en este caso va a estar definida en una clase llamada ArrayListLibros.
// Esta vez tendremos los siguientes métodos:
//insertar(Libro li): lo añade a la colección, pero esta vez sin preocuparnos del orden.
//numLibros(): nos devuelve la cantidad de libros que contiene la colección.
//eliminarLibro(int posicion): elimina de la colección el libro que se encuentra en la posición indicada.
//obtenerLibro(int posicion): devuelve el libro que se encuentra en esa posición (sin eliminarlo).
//buscarLibro(String buscada): devuelve la posición en la que se encuentra el primer libro
// que contiene en su título la cadena buscada.
//ordenarPorTitulo(): ordena la colección por orden alfabético de título
// (sin distinguir mayúsculas y minúsculas).
//ordenarPorPaginas(): ordena la colección por el número de páginas de menor a mayor.
//Para poder hacer estos métodos de ordenación tendrás que haber creado dos clases
// que implementen la interfaz Comparator: la clase TituloComparator y la clase PaginasComparator.
//Crea una clase PruebaArrayListLibros en la que se verifique que todos los métodos funcionan correctamente.

import java.util.Collections;

public class pruebaArrayListaLibros {
    public static void main(String[] args) {
        ArrayListaLibros coleccion = new ArrayListaLibros();

        coleccion.insertar(new Libro("jose", 176));
        coleccion.insertar(new Libro("pepe", 180));
        coleccion.insertar(new Libro("weed", 1234));
        coleccion.insertar(new Libro("stilton", 345));
        coleccion.insertar(new Libro("cars", 500));

        coleccion.eliminarLibro(2);

        System.out.println(coleccion.obtenerLibro(1));

        System.out.println("El liro buscado es el " + coleccion.buscarLibro("cars") + " en la coleccion.");

        coleccion.ordenarPorPaginas();

        coleccion.ordenarPorTitulo();

        System.out.println("numero de libros : " + coleccion.numLibros());


    }

}