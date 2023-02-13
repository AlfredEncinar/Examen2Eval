package Unidad4.Ejercicio7;

import java.util.Stack;
public class UsoPilaPalabras {
    public static void main(String[] args) {


        Stack<String> pila = new Stack<>();

        pila.push("Cafe");
        pila.push("alfred");
        pila.push("joder");

        System.out.println("La pila contiene los elementos: ");
        System.out.println(pila);

        System.out.println("\nDesapilando elementos de la pila: ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }


}