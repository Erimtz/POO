public class Vacio implements CarritoState {

    @Override
    public CarritoState agregarProducto() {
        return new Cargando();
    }

    @Override
    public CarritoState cancelarCarrito() {
        return new Vacio();
    }

}