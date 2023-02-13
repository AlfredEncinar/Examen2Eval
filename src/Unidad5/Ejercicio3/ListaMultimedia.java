package Unidad5.Ejercicio3;

import java.util.ArrayList;

public class ListaMultimedia {

    public static void main(String[] args) {

        ArrayList<Multimedia> multimedia = new ArrayList<>();

        multimedia.add(new Pelicula("Cars ", "Alfred ", "mp4 ", 128.4, "Rayo McQueen", null));
        multimedia.add(new Pelicula("Avatar ","James Cameron ","mp4 ", 245.4,"Juan Molina ", "Lusy Stevens"));
        multimedia.add(new Pelicula("Titanic ","james Cameron ","mp4 ",223.1,"Leonardo Dicaprio",null));
        multimedia.add(new Disco("Aura ", "Ozuna ", "mp3 ", 5, "Reguetton"));
        multimedia.add(new Disco("Por siempre ","Bad Bunny ","mp3 ",7,"Trap latino"));
        multimedia.add(new Disco("Real hatsa la muerte BB ","Anuel AA ","mp3 ",14,"Reguetton"));

        for (Multimedia m : multimedia) {
            System.out.println(m);
        }



    }


}
