import java.util.ArrayList;
import java.util.List;

public class FiguraCompleja implements FiguraDibujable {
    private String nombre;
    private List<FiguraDibujable> misFiguras;

    public FiguraCompleja(String nombre) {
        this.nombre = nombre;
        misFiguras = new ArrayList<FiguraDibujable>();
    }

    public void agregaFigura(FiguraDibujable f){
        misFiguras.add(f);
    }

    @Override
    public void dibujar() {
        for (FiguraDibujable x: misFiguras) {
            x.dibujar();
        }
    }

}
