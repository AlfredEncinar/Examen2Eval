package Unidad4.Ejercicio8;

import java.util.ArrayList;

public class ArrayProducto {
    private ArrayList<Producto> lista;

    public ArrayProducto() {
        this.lista = new ArrayList<>();
    }

    public void agregar(Producto producto) {
        lista.add(producto);
    }

    public void eliminar(Producto producto) {
        lista.remove(producto);
    }

    public Producto obtener(int posicion) {
        return lista.get(posicion);
    }

    public Producto buscar(int codigo) {
        for (Producto producto : lista) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    public int tamaño() {
        return lista.size();
    }

    public void imprimirLista() {
        for (Producto producto : lista) {
            System.out.println("Producto [codigo=" + producto.getCodigo() + ", nombre=" + producto.getNombre() + ", tipo="
                    + producto.getTipo() + ", precio=" + producto.getPrecio() + ", stock=" + producto.getStock() + "]");
        }
    }

    public void cambiarPrecio(int codigo, double nuevoPrecio) {
        Producto producto = buscar(codigo);
        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
        }
    }
}