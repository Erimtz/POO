import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CargaSimple = FactoryBarco.CrearCarga("TV 32’ LCD", " 3 kg", "SLW123");
        CargaSimple = FactoryBarco.CrearCarga("caja de medicamentos", "2 kg", " “FST-456");

        Set<Carga> Contenedor = new HashSet<>();
        Contenedor.add(CargaSimple);
        Contenedor.add(CargaSimple);


        Contenedor = FactoryBarco.CrearContenedor("TV 32’ LCD, caja de medicamentos", "100 kg");

    }
}
