public class ArmaLarga extends Arma implements  Comparable {
    private String renar;
    private String descripcionUso;
    private int nivelArma;

    public ArmaLarga(String nombre, String apellido, String legajo, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estadoArma, String renar, String descripcionUso, int nivelArma) {
        super(nombre, apellido, legajo, cantidadMuniciones, alcanceMetros, marca, calibre, estadoArma);
        this.renar = renar;
        this.descripcionUso = descripcionUso;
        this.nivelArma = nivelArma;
    }

    public ArmaLarga(String nombre, String apellido, String legajo, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estadoArma) {
        super(nombre, apellido, legajo, cantidadMuniciones, alcanceMetros, marca, calibre, estadoArma);
    }

    public ArmaLarga(String nombre, String apellido, String legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga armaLarga = (ArmaLarga) o;
        return armaLarga.nivelArma - this.nivelArma;
    }
}
