package Unidad6;

//Escribe un programa que muestre los nombres
// de los archivos y los directorios
// que se encuentrenen
// un directorio que se pase como argumento (args[0]).

import java.io.File;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Obtener el directorio especificado por el primer argumento
        String directorio = args[0];

        // Crear un objeto File para representar el directorio
        File dir = new File(directorio);

        // Verificar que el directorio existe
        if (!dir.isDirectory()) {
            System.out.println("El directorio " + directorio + " no existe.");
            return;
        }

        // Obtener una lista de los archivos y directorios en el directorio
        File[] files = dir.listFiles();

        // Imprimir los nombres de archivo y directorio
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
