public class Arma extends  Policia {
    private int cantidadMuniciones;
    protected double alcanceMetros;
    private String marca;
    private int calibre;
    private String estadoArma;

    public Arma(String nombre, String apellido, String legajo, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estadoArma) {
        super(nombre, apellido, legajo);
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estadoArma = estadoArma;
    }

    public Arma(String nombre, String apellido, String legajo) {
        super(nombre, apellido, legajo);
    }

    public boolean condicionesDeUso() {
        if (this.estadoArma == "EN USO" && this.calibre >= 9) {
            return true;
        }
        return false;
    }


}
