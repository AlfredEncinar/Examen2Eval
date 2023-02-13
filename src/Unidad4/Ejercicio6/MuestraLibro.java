package Unidad4.Ejercicio6;


public class MuestraLibro {

    public static void main(String[] args) {

        Libro libro = new Libro ("Biografía de Alfred " , "1º" , new Persona("Alfred" , " Encinar") , 123485-434 ,568 , "History books" , "Jaca(Huesca)" , new Fecha("Jueves 20" , "Febrero" , "2020"));

        libro.mostrarInfirmacion();

    }
}