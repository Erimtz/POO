import java.util.List;

public class Carrito {
    private CarritoState state;
    private List<Producto> productos;

    public Carrito(CarritoState state, List<Producto> productos) {
        this.state = state;
        this.productos = productos;
    }

    private CarritoState getState() {
        return state;
    }

    public void setState(CarritoState state) {
        this.state = state;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void cancelarCarrito() {
        this.state = this.state.cancelarCarrito();
    }
}


