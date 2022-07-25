package cm;

public class Curso extends OfertaAcademica  implements Precio, Informe {
    private int cargaHoraria;
    private int mesesDuracion;
    private int valorHora;

    public Curso(String nombre, String descripcion, int cargaHoraria, int mesesDuracion, int valorHora) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }

    @Override
    public double precio() {
        return (cargaHoraria * valorHora) * mesesDuracion;
    }

    @Override
    public String Informe() {
        return "Materia:" + nombre + ", " + "Precio:" + precio();
    }
}
