public class Yate extends  Embarcacion implements Comparable {

    private int cdadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int eslora, int cdadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cdadCamarotes = cdadCamarotes;
    }

    @Override
    public void navegar() {
        System.out.println("\nSoy un yate y estoy navegando :33");
        System.out.println("                  __/___\n" +
                "            _____/______|\n" +
                "    _______/_____\\_______\\_____\n" +
                "    \\              < < <       |\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Los datos de mi capitan son:" + datosCapitan());
    }

    @Override
    public int compareTo(Object o) {
        Yate yateAComparar = (Yate) o;
        int resultado = 0;
        if (this.cdadCamarotes > yateAComparar.cdadCamarotes)
            resultado = 1;
        else if (this.cdadCamarotes < yateAComparar.cdadCamarotes)
            resultado = -1;
        return resultado;
    }
}
