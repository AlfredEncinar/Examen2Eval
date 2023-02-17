package Unidad6.Ejercicio11;

public class Cliente {

    private String nombreCompleto;
    private String telefono;
    private String direccion;
    private String nif;
    private boolean moroso;

    public Cliente(String nombreCompleto,String telefono, String direccion,String nif,boolean moroso) {

        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nif = nif;
        this.moroso = moroso;
    }

    public boolean isMoroso() {
        return moroso;
    }
}

