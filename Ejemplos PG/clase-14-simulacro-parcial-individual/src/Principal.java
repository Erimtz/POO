public class Principal {
    public static void main(String[] args) {
        Capitan pepe = new Capitan("Pepe", "Pepardo", 1234);
        Capitan pepa = new Capitan("Pepa", "Peparda", 4321);
        Embarcacion yate1 = new Yate(pepe, 5000, 1000, 2019, 60, 5);
        Embarcacion yate2 = new Yate(pepa, 7500, 1500, 2021, 80, 3);
        Embarcacion velero1 = new Velero(pepe, 2500, 750, 2017, 20, 3);
        Embarcacion velero2 = new Velero(pepa, 4000, 1200, 2018, 40, 5);

        velero1.navegar();
        System.out.println("\nEl velero 1 es grande: " + ((Velero)velero1).esGrande());
        System.out.println("Alquiler velero 1: " + velero1.calcularAlquiler());
        velero2.navegar();
        System.out.println("\nEl velero 2 es grande: " + ((Velero)velero2).esGrande());
        System.out.println("Alquiler velero 2: " + velero2.calcularAlquiler());

        yate1.navegar();
        System.out.println("\nAlquiler yate 1: " + yate1.calcularAlquiler());
        yate2.navegar();
        System.out.println("\nAlquiler yate 2: " + yate2.calcularAlquiler());
        System.out.println("\nEl yate 1 es más lujoso que el yate 2: " + ((Yate)yate1).compareTo(yate2));
        System.out.println("El yate 2 es más lujoso que el yate 1: " + ((Yate)yate2).compareTo(yate1));
    }
}
