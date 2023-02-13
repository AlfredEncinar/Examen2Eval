package Unidad5.Ejercicio3;

public class Pelicula extends Multimedia {

    private String actor;
    private String actriz;


    public Pelicula(String titulo, String autor, String formato, double duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;

        try {
            if (actor == null && actriz == null) {
                throw new IllegalArgumentException("no puede haber dos null");
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }

    }


    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }


    @Override
    public String toString() {
        String salida;
        salida = "Pelicula : " + super.toString() + "\n " + actor + "\n" + actriz;
        return salida;
    }
}