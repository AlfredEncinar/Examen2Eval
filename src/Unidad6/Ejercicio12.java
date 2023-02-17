package Unidad6;

//Utilizando expresiones regulares, realiza los siguientes procedimientos para validar strings que se leerán por teclado:
//
//- Validar un número de teléfono nacional sin espacios: ej 974283921
//
//- Validar un número de teléfono internacional: ej (+34)974283921
//
//- Validar un código postal
//
//- Validar una fecha en formato dd/mm/aaaa

public class Ejercicio12 {


    //Validar un número de teléfono nacional sin espacios: ej 974283921
    String regexTelefonoNacional = "^[67]\\d{8}$";

    //Validar un número de teléfono internacional: ej (+34)974283921
    String regexTelefonoInternacional = "^\\(\\+\\d{2}\\)\\d{9}$";


    //Validar un código postal
    String regexCodigoPostal = "^\\d{5}$";


    //Validar una fecha en formato dd/mm/aaaa
    String regexFecha = "^\\d{2}/\\d{2}/\\d{4}$";



}
