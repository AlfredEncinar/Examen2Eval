package Unidad4.Ejercicio6;

public class Fecha {

    private String dia, mes, anio; // Atributos


    public Fecha(String d, String m, String a) {
        dia = d;
        mes = m;
        anio = a;

    }

    public String toString() { // A�adido Alberto
        return (dia + " de " + mes + " del " +anio);
    }

}