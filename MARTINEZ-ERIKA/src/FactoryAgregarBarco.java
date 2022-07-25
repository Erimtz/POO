import java.util.Set;

public class FactoryBarco {
    public static CargaSimple CrearCarga(String nombre, double pesoCarga, Carga carga, Set<Carga> cargas) {
        return new CargaSimple (nombre,pesoCarga, carga, cargas);
    }

    public static Contenedor CrearContenedor(String nombre, Carga carga, Set<Carga> cargas) {
        return new Contenedor(nombre, carga, cargas, cargas);
    }
}
