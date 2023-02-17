package Unidad5.Ejercicio4;

public class Libro extends Biblioteca implements Prestable {

    private boolean prestar;
    private boolean devolver;
    private boolean prestado;

    public Libro(int codigo, String titulo, int annoPublicacion,boolean prestado) {
        super(codigo,titulo,annoPublicacion);
        this.prestar = prestar;
        this.devolver = devolver;
        this.prestado = prestado;
    }

    public boolean prestar(){

        return prestar;
    }

    public boolean devolver(){

        return devolver;
    }
    @Override
    public boolean prestado() {


        return prestado;
    }


    public String toString() {
        return "Esto es un libro. \n" + super.toString() + "\nLibro prestado: " + prestado + "\n";
    }
    
}
