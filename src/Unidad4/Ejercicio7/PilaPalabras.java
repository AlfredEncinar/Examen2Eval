package Unidad4.Ejercicio7;

//Escribe una clase de nombre PilaPalabras,
// para gestionar una estructura de pila que permita
// apilar y desapilar objetos de la clase String.
// La clase implementará el método apilarPalabra para poner
// una palabra en la cima de la pila, el método desapilarPalabra
// para quitar el elemento de la cima de la pila devolviéndolo
// y el método obtenerPalabtaCima para obtener la palabra situada
// en la cima de la pila sin quita4rla de ella. También implementrá
// el método pilaPlabrasVacia para determinar si la pila está o no vacía
// . Los metodos deven implementarse utilizando la clase LinkedList.
//Escribe una clase de nombre PilaPalabras, para gestionar una estructura de pila que permita apilar y desapilar objetos de la clase String. La clase implementará el método apilarPalabra para poner una palabra en la cima de la pila, el método desapilarPalabra para quitar el elemento de la cima de la pila devolviéndolo y el método obtenerPalabtaCima para obtener la palabra situada en la cima de la pila sin quita4rla de ella. También implementrá el método pilaPlabrasVacia para determinar si la pila está o no vacía. Los metodos deven implementarse utilizando la clase LinkedList.
//Escribe un programa que utilizando la clase PilaPalabras, introduzca varias cadenas de caracteres en la pila y las desapile mostrándolas por pantalla.

import java.util.LinkedList;

public class PilaPalabras {

    private LinkedList<String> pila;

    public PilaPalabras() {
        pila = new LinkedList<String>();
    }

    public void apilarPalabra(String palabra) {
        pila.addFirst(palabra);
    }

    public String desapilarPalabra() {
        return pila.removeFirst();
    }

    public String obtenerPalabraCima() {
        return pila.getFirst();
    }

    public boolean pilaPalabrasVacia() {
        return pila.isEmpty();
    }
}
