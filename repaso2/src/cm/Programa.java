package cm;

import java.util.List;

public class Programa extends OfertaAcademica implements Precio, Informe {
    private List<Curso> cursos;
    private double porcentajeBonificacion;

    public Programa(String nombre, String descripcion, List<Curso> cursos, double porcentajeBonificacion) {
        super(nombre, descripcion);
        this.cursos = cursos;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }


    @Override
    public double precio() {
        double suma = 0;
        for (int i=0; i < this.cursos.size(); i++){
           suma = suma + this.cursos.get(i).precio();
        }
        return suma - (suma * porcentajeBonificacion);
    }

    @Override
    public String Informe() {
        return "Programa:" + nombre + ", " + "Precio final:" + precio();
    }
}
