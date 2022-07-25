public class Cuadrado implements FiguraDibujable {
    private String nombre;
    private int lado;

    public Cuadrado(String nombre, int lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("cuadrado");
    }
}
