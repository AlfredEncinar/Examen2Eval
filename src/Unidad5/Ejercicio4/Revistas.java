package Unidad5.Ejercicio4;

public class Revistas {
    private int codigo;
    private String titulo;
    private int anno;
    private int numero;



    public Revistas(int codigo,String titulo,int anno,int numero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anno = anno;
        this.numero = numero;

    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return " Revistas " +
                " codigo = " + codigo +
                " , titulo = " + titulo +
                " , anno = " + anno +
                " , numero = " + numero;
    }
}
