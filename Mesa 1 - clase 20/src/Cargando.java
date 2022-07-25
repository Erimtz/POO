public class Cargando implements  CarritoState {
    @Override
    public CarritoState agregarProducto() {
        return new Cargando();
    }

    @Override
    public CarritoState cancelarCarrito() {
        return null;
    }
}
