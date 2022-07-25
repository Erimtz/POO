import java.util.Set;

public class FactoryOfertasAcademicas {
    public static Curso CrearCurso(String nombre, String descripcion, int cargaHorariaMensual, int mesesDuracion, double valorHora) {
        return new Curso(nombre, descripcion, cargaHorariaMensual, mesesDuracion, valorHora);
    }

    public static Programa CrearPrograma(String nombre, String descripcion, double bonificacion, Set<Curso> cursos) {
        return new Programa(nombre, descripcion, bonificacion, cursos);
    }
}
