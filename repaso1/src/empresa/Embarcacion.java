package empresa;

public class Embarcacion {
    private static final int ANIOFABRICACION = 2020;
    private Capitan capitan;
    private double precioBase;
    private int anioFabricacion;
    private double valorAdicional;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double montoAlquiler() {
        if( this.anioFabricacion > ANIOFABRICACION){
            return precioBase + valorAdicional;
        }

        return precioBase;
    }
}
