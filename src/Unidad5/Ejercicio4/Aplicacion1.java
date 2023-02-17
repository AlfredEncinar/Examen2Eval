package Unidad5.Ejercicio4;

import java.util.ArrayList;

public class Aplicacion1 {

    ArrayList<Biblioteca> biblioteca = new ArrayList<>();

    /**
     * Donde cargo la lista de prueba
     */

    public void cargaDatosLista() {

        biblioteca.add(new Libro(3454, "Nueces", 1500,false));
        biblioteca.add(new Libro(3256, "Cantar", 1300,true));
        biblioteca.add(new Revistas(2546, "Motor", 1350, 8));
        biblioteca.add(new Revistas(2879, "Belleza", 1003, 1));

        for (Biblioteca b : biblioteca) {

            System.out.println(b);
        }

    }

    public int cuentaPrestados() {
        /**
         * recibe por parámetro un array de objetos y devuelve cuántos de ellos están prestados.
         */

        int prestado = 0;
        for (Biblioteca b : biblioteca) {
            if (b instanceof Libro) {
                Libro l = (Libro) b;
                if (l.prestado()== true) {
                    prestado ++;
                }

            }
        }System.out.println("Hay " + prestado + " libros prestados");
        System.out.println();
        return prestado;
    }



    public int publicacionesAnterioresA() {
        /**
         * recibe por parámetro un array de Publicaciones y un año, devolviendo cuántas publicaciones tienen fecha anterior al año 1980.
         */
        int fechaAnterior = 0;

        for (Biblioteca b : biblioteca) {
            if (b instanceof Libro) {
                Libro l = (Libro) b;
                if (l.getAnnoPublicacion() < 1980) {
                    fechaAnterior++;

                }
            }
        }System.out.println("Hay " + fechaAnterior + " libros anteriores a 1980");

        System.out.println();

        return fechaAnterior;
    }

    public int fechaAnterior(){
        /**
         * recibe por parámetro un array de Publicaciones y un año, devolviendo cuántas publicaciones tienen fecha anterior al año 1980.
         */

        int fechRevista = 0;

        for (Biblioteca b : biblioteca) {
            if (b instanceof Revistas) {
                Revistas r = (Revistas) b;
                if (r.getAnnoPublicacion() < 1980) {
                    fechRevista++;

                }


            }
        }System.out.println("Hay " + fechRevista + " revistas anteriores a 1980");

        System.out.println();
        return fechRevista;
    }

}

