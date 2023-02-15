package Unidad4.Ejercicio10;

//Desarrollar una lista de libros ordenada por título.
// La funcionalidad de la lista será la habitual:
// conocer el número de libros que hay en la lista,
// insertar un nuevo libro (en la posición que corresponda),
// eliminar el libro de una determinada posición
// y obtener el libro de una determinada posición.
// También incluirá un método para buscar un libro a partir de
// una parte de su título (sin distinguir entre mayúsculas y minúsculas);
// el método devolverá la posición en la que se
// encuentra el libro (-1 si no lo encuentra).

import Unidad4.Ejercicio9.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class ListtaLibros {
    public static void main(String[] args) {

        ArrayList<Unidad4.Ejercicio9.Libro>libros = new ArrayList<>();

        int cantidad = contadorLibros(libros);
        System.out.println("la cantidad de libros es : " + cantidad);





    }
    public static int contadorLibros(ArrayList<Unidad4.Ejercicio9.Libro>libros ){

        return libros.size();
    }

    public void insert(int a , Unidad4.Ejercicio9.Libro objeto){
        Scanner sc = new Scanner(System.in);

        insert(a = sc.nextInt(),objeto);
    }

    public Unidad4.Ejercicio9.Libro removeEn(int a){
        Scanner sc = new Scanner(System.in);
        return removeEn(a = sc.nextInt());
    }

    public Libro getEn(int a){
        Scanner sc = new Scanner(System.in);

        return getEn(a = sc.nextInt());
    }

}
