package Unidad4.Ejercicio3;

//Queremos gestionar la venta de entradas (no numeradas) de Expocoches Huesca que tiene 3 zonas:

//- La sala principal con 1000 entradas disponibles

//- La zona de compra-venta con 200 entradas disponbles

//- La zona vip con 25 entradas disponibles

//Hay que controlar que hay entradas disponibles antes
// de venderlas. La clase Zona con sus atributos y métodos se muestra a continuación


public class Zona {

    private int entradasPorVender;

    private int salaPrincipal;

    private int compraVenta;

    private int zonaVip;


    public Zona(int n) {

        this.entradasPorVender = n;

    }

    public int getEntradasPorVender() {

        return entradasPorVender;
    }

    public void vender(int n) {

        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esta zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo quedan " + this.entradasPorVender + " entradas para esa zona.");
        } else {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }

}
