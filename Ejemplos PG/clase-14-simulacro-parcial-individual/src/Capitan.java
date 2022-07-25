public class Capitan {

    private String nombre;
    private String apellido;
    private int matriculaNavegacion;

    public Capitan(String nombre, String apellido, int matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    @Override
    public String toString() {
        return "\nCapitan" +
                "\n\tNombre: '" + this.nombre + "'" +
                "\n\tApellido: '" + this.apellido + "'" +
                "\n\tMatricula de Navegacion: " + this.matriculaNavegacion;
    }
}
