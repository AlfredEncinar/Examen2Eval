package Unidad5;

//Realiza un procedimiento que vuelque la fecha actual
// en seis variables correspondientes
// al año, mes, día, hora, minutos y segundos.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int annio =2023;
        int mes = 1;
        int dia = 14;
        int hora = 18;
        int minutos = 12;
        int segundos = 45;

        LocalDateTime fechaActual = LocalDateTime.of(annio,mes,dia,hora,minutos,segundos);
        System.out.println(fechaActual);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM - dd - YY");
        System.out.println(dtf.format(fechaActual));



    }


}
