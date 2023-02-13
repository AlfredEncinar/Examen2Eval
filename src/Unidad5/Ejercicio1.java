package Unidad5;

//Realiza un procedimiento que a partir de un día,
// mes y año introducido por el teclado,
// indique el día de la semana al que corresponde
// y que fecha será cuando hayan transcurrido 100 días.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;
import java.time.DayOfWeek;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introuduce el año : ");

        int año = sc.nextInt();
        System.out.println("Introudce el mes : ");
        int mes = sc.nextInt();
        System.out.println("introduce el día : ");
        int dia = sc.nextInt();


        DayOfWeek diaSemana = LocalDate.of(año , mes , dia).getDayOfWeek();
        System.out.println(diaSemana);

        System.out.println(diaSemana.plus(100));
        System.out.println(año + mes + dia);

    }

}