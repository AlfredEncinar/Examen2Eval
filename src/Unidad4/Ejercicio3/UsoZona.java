package Unidad4.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoZona {

    public static void main(String[] args) {

        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Tenemos " + salaPrincipal.getEntradasPorVender() + " entradas de la sala principal");
                System.out.println("Tenemos " + compraVenta.getEntradasPorVender() + " entradas de la zoona de compra venta");
                System.out.println("Tenemos " + zonaVip.getEntradasPorVender() + " entradas de la zona vip");
            } else if (opcion == 2) {
                System.out.println("para que zona querias las entradas : ");
                System.out.println("zona principal = pulse 1  / zona compra venta = pulse 2 / zona vip = pulse 3 ");
                int aux = sc.nextInt();
                if (aux == 1) {
                    System.out.println("hay " + salaPrincipal.getEntradasPorVender() + " entradas ");
                    System.out.println("¿Cuantas entradas queria?");
                    sc.nextInt();
                    System.out.println("¡Gracias por comprar!");
                } else if (aux == 2) {
                    System.out.println("hay " + compraVenta.getEntradasPorVender() + "entradas");
                    System.out.println("¿Cuantas entradas queria?");
                    sc.nextInt();
                    System.out.println("¡Gracias por comrpar!");
                } else if (aux == 3) {
                    System.out.println("hay " + zonaVip.getEntradasPorVender() + " entradas");
                    System.out.println("¿Cuantas entradas queria?");
                    sc.nextInt();
                    System.out.println("¡Gracias por comprar!");
                }
            } else break;
        }
    }
}


