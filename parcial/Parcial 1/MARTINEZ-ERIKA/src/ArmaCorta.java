public class ArmaCorta extends Arma implements Funcionalidad {
    private boolean automatica;

    public ArmaCorta(String nombre, String apellido, String legajo, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estadoArma, boolean automatica) {
        super(nombre, apellido, legajo, cantidadMuniciones, alcanceMetros, marca, calibre, estadoArma);
        this.automatica = automatica;
    }

    public ArmaCorta(String nombre, String apellido, String legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public boolean puedeDisparar200() {
        return alcanceMetros >= 200;
    }
}
