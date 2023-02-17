package Unidad6;

//Escribe un método que reciba por parámetro dos rutas correspondientes
// a un archivo de origen y a otro de destino y que copie
// el archivo de origen al de destion. La ruta de destino
// puede corresponder a un archivo o a un directorio.
// En el primer caso, el archivo se creará en el directorio
// especificado manteniendo su nombre. En el segundo, se tomará
// como nombre del archivo copia el que especifique su ruta.
// Además, el método recibirá un tercer parámetro que actuará
// de bandera, para el caso en que el archivo especificado
// como destino exista previamente. Si la bandera es cierta,
// el archivo existente se sobreescribirá con la copia.
// En caso contrario, la operación de copia terminará.
// El método generará una excepción si la bandera de
// reemplazo vale false y el archivo de destino existe.


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejercicio10 {



    public void copiarArchivo(String rutaOrigen, String rutaDestino, boolean sobreescribir) throws IOException {
        // Crear objeto File para el archivo de origen
        File origen = new File(rutaOrigen);

        // Verificar que el archivo de origen existe y es un archivo regular
        if (!origen.exists() || !origen.isFile()) {
            throw new IllegalArgumentException("El archivo de origen no existe o no es un archivo.");
        }

        // Crear objeto File para el archivo de destino
        File destino = new File(rutaDestino);

        // Verificar si el archivo de destino ya existe
        if (destino.exists()) {
            // Si el archivo de destino existe y la bandera de sobreescribir es falsa, lanzar excepción
            if (!sobreescribir) {
                throw new IOException("El archivo de destino ya existe.");
            }
            // Si la bandera de sobreescribir es verdadera, borrar el archivo de destino
            destino.delete();
        } else {
            // Si el archivo de destino no existe, verificar si es un directorio
            File parent = destino.getParentFile();
            if (!parent.isDirectory()) {
                throw new IllegalArgumentException("La ruta de destino no es un directorio.");
            }
        }

        // Copiar el archivo de origen al archivo de destino
        FileInputStream inputStream = new FileInputStream(origen);
        FileOutputStream outputStream = new FileOutputStream(destino);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

}
