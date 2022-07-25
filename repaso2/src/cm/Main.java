package cm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Curso frontEnd = new Curso("Front End",
                "Curso front end 16 horas",
                16,2,1000);
        Curso backEnd = new Curso("Back End",
                "Curso back end 20 horas",
                20,2,900);
        List<Curso> listaCursos = new ArrayList<Curso>();
        listaCursos.add(frontEnd);
        listaCursos.add(backEnd);

        Programa fullStack = new Programa("FullStack",
                 "Front End, Back End",
                listaCursos,
                0.20);

        System.out.println(frontEnd.Informe());
        System.out.println(backEnd.Informe());
        System.out.println(fullStack.Informe());
    }


}
