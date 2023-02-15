package Unidad4.Ejercicio10;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ArrayListaLibros {


    private ArrayList<Libro>libros;

    public  void insertar(Libro li){
        if (libros == null){
            libros = new ArrayList<>();
        }
        libros.add(li);
    }

    public int numLibros(){
        if (libros == null){
            return 0;
        }
        return libros.size();
    }

    public void eliminarLibro(int posicion){

        if (libros == null || posicion<0 || posicion>= libros.size()){

            return;
        }
        libros.remove(posicion);

    }

    public Libro obtenerLibro(int posicion){
        if (libros==null || posicion <0 || posicion >= libros.size()){
            return null;
        }
       return libros.get(posicion);
    }

    public int buscarLibro(String buscada) {
        if (libros == null) {
            return -1;
        }
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            if (libro.getTitulo().toLowerCase().contains(buscada.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
    public void ordenarPorTitulo() {
        if (libros == null) {
            return;
        }
        Comparator<Libro> comparador = new TituloComparator();
        Collections.sort(libros, comparador);
    }

    public void ordenarPorPaginas() {
        if (libros == null) {
            return;
        }
        Comparator<Libro> comparador = new PaginasComparator();
        Collections.sort(libros, comparador);
    }

    private static class TituloComparator implements Comparator<Libro> {
        @Override
        public int compare(Libro l1, Libro l2) {
            return l1.getTitulo().compareToIgnoreCase(l2.getTitulo());
        }
    }

    private static class PaginasComparator implements Comparator<Libro> {
        @Override
        public int compare(Libro l1, Libro l2) {
            return l1.getNumPags() - l2.getNumPags();
        }
    }













}


