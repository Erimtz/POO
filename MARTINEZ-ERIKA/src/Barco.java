
import java.util.Set;

public class Barco {

    private Carga carga;
    private Set<Carga> cargas;

    @Override
    public String toString() {
        return Carga.getNombre() + this.carga.calcularPeso();
    }

    public void AgregarCargas (Carga cargas) {
        this.cargas.add((Carga) cargas);
    }

}
