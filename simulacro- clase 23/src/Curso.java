import com.company.OfertaAcademica;

public class Curso extends OfertaAcademica {
    private  int cargaHorariaMensual;
    private int mesesDuracion;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cargaHorariaMensual, int mesesDuracion, double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return (cargaHorariaMensual * valorHora) * mesesDuracion;
    }

    @Override
    public String toString() {
        return super.getNombre() + "$" + this.calcularPrecio();
    }
}
