import com.company.OfertaAcademica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso frontEnd = FactoryOfertasAcademicas.CrearCurso("Front End",
                "Curso front end 16 horas",
                16, 2, 1000);

        Curso backEnd = FactoryOfertasAcademicas.CrearCurso("Back End",
                "Curso back end 20 horas",
                20, 2, 900);

        Set<Curso> cursosParaFullStack = new HashSet<>();
        cursosParaFullStack.add(frontEnd);
        cursosParaFullStack.add(backEnd);

        OfertaAcademica fullStack = FactoryOfertasAcademicas.CrearPrograma("FullStack",
                "Front End, Back End",
                0.20, cursosParaFullStack);

        Instituto dh = new Instituto();
        dh.AgregarOfertaAcademica(fullStack);
        dh.AgregarOfertaAcademica(frontEnd);
        dh.AgregarOfertaAcademica(backEnd);
        dh.generarInforme();
    }
}
