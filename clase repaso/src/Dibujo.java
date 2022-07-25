import java.util.ArrayList;
import java.util.List;

public class Dibujo {

    private List<FiguraDibujable> componentes = new ArrayList<FiguraDibujable>();

    public void agrega(FiguraDibujable f){
        componentes.add(f);
    }

    public void dibuja(){
        for (FiguraDibujable g: componentes) {
            g.dibujar();
            System.out.println("-----------");
        }
    }

}
