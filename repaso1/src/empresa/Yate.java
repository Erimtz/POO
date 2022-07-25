package empresa;

public class Yate extends Embarcacion implements Comparable{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object obj) {
        Yate yateComparable = (Yate) obj;
        return yateComparable.cantidadCamarotes - this.cantidadCamarotes;
    }
}
