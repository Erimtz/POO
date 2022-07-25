public class Velero extends  Embarcacion {

    private int cdadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int eslora, int cdadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cdadMastiles = cdadMastiles;
    }

    @Override
    public void navegar() {
        System.out.println("\nSoy un velero y estoy navegando :3");
        System.out.println("           /|\\\n" +
                "         /__| )\n" +
                "       /____| ))\n" +
                "     /______| )))\n" +
                "   /________|  )))\n" +
                "           _|____))\n" +
                "   \\======| o o /\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Los datos de mi capitan son:" + datosCapitan());
    }

    public boolean esGrande() {
        return this.cdadMastiles > 4;
    }
}
