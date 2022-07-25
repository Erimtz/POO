import java.util.Set;

public class CargaSimple extends Carga {
    private String nombre;
    private double pesoCarga;
    private static final String CODIGO1 = "SLW-123";
    private static final String CODIGO2 = "FST-456";

    public CargaSimple(String nombre, double pesoCarga, Carga carga, Set<Carga> cargas) {

    }


    @Override
    public double calcularPeso() {
        if (this.nombre.equals(CODIGO1)) {
            return this.pesoCarga + 1.10;
        }

        if (this.nombre.equals(CODIGO2)) {
            return this.pesoCarga - 1.10;

        }
        return pesoCarga;
    }
}
