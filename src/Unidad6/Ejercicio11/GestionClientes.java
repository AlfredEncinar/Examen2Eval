package Unidad6.Ejercicio11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionClientes {
    private static final String FILENAME = "clientes.dat";

    public static void main(String[] args) {
        List<Cliente> clientes = leerClientes();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Introducir un nuevo cliente");
            System.out.println("2. Visualizar datos de los clientes");
            System.out.println("3. Listado de clientes morosos");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    Cliente nuevoCliente = leerClienteDesdeTeclado(scanner);
                    clientes.add(nuevoCliente);
                    escribirClientes(clientes);
                    System.out.println("El cliente ha sido añadido al archivo.");
                    break;
                case 2:
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 3:
                    List<Cliente> clientesMorosos = obtenerClientesMorosos(clientes);
                    if (clientesMorosos.isEmpty()) {
                        System.out.println("No hay clientes morosos.");
                    } else {
                        for (Cliente cliente : clientesMorosos) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static Cliente leerClienteDesdeTeclado(Scanner scanner) {
        System.out.print("Nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("NIF: ");
        String nif = scanner.nextLine();
        System.out.print("¿Es moroso (S/N)? ");
        boolean moroso = scanner.nextLine().equalsIgnoreCase("S");
        return new Cliente(nombreCompleto, telefono, direccion, nif, moroso);
    }

    private static List<Cliente> leerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (FileNotFoundException e) {
            // El archivo no existe, no hacemos nada
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    private static void escribirClientes(List<Cliente> clientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Cliente> obtenerClientesMorosos(List<Cliente> clientes) {
        List<Cliente> clientesMorosos = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.isMoroso()) {
                clientesMorosos.add(cliente);
            }
        }
        return clientesMorosos;
    }
}
