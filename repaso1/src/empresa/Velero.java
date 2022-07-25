package empresa;

public class Velero extends Embarcacion implements  Tamanio{
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public boolean esGrande() {
        return cantidadMastiles > 4;
    }
}
