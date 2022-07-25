public abstract class Carga {
    private String nombre;
    private double pesoCarga;

    protected static String getNombre() {
        return this.nombre;
    }

    public abstract double calcularPeso();

}
