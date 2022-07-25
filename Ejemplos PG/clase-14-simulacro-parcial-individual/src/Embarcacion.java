public abstract class Embarcacion {

    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private int eslora;
    private Capitan capitan;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public abstract void navegar();

    public double calcularAlquiler() {
        double resultado = this.precioBase;
        if (this.anioFabricacion > 2020) {
            resultado += this.valorAdicional;
        }
        return resultado;
    }

    public String datosCapitan() {
        return this.capitan.toString();
    }
}
