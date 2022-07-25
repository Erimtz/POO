import java.util.Set;

public class Contenedor extends Carga {
    private String nombre;
    private double pesoCarga;
    private Set<Carga> cargas;

    public Contenedor(String nombre, double pesoCarga, Set<Carga> cargas) {
        this.nombre = nombre;
        this.pesoCarga = pesoCarga;
        this.cargas = cargas;
    }

    @Override
    public double calcularPeso() {
        double totalCarga = 0;
        for (Carga carga : this.cargas) {
            totalCarga += carga.calcularPeso();

        }
        return totalCarga;
    }
}
