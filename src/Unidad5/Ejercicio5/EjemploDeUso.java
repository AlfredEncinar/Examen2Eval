package Unidad5.Ejercicio5;

import java.util.ArrayList;

/**
 * Clase donde cargo el metodo de pruebas para crear el ArrayList de objetos.
 */

public class EjemploDeUso {

        ArrayList<Disco> disco = new ArrayList<>();

        public void cargaDatosPruebas(){

        disco.add(new DiscoPrestable("Forever", "Geremias", Formato.MPG, 4.34, Genero.Folk,true));
        disco.add(new DiscoPrestable("Forever", "Michaela", Formato.WAV, 8.25, Genero.Pop,true));
        disco.add(new DiscoPrestable("Bohemian Rapsody", "Queen", Formato.MP3, 9.25, Genero.Rock,true));

        for(Disco d:disco){
                System.out.println(d);

        }
    }

        public int cuentaPrestados() {
                /**
                 * Compara los discos prestados y devuelve la cantidad
                 */
                int prestados = 0;
                for (Disco d : disco) {
                        if (d instanceof DiscoPrestable) {
                                DiscoPrestable s = (DiscoPrestable) d;
                                if (s.prestado() == true) {
                                        prestados++;
                                }

                        }
                }System.out.println("Se han prestado " + prestados + " discos.");


                return prestados;
        }

}

