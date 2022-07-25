public class FigurasFactory {
    public static FiguraDibujable getFigura(String cual) {
        FiguraDibujable resulta = null;
        if (cual.equals("triangulo chico")) {
            resulta = new Triangulo("Chico", 5, 5, 5);
        }

        if (cual.equals("triangulo grande")) {
            resulta = new Triangulo("Grande", 50, 50, 50);
        }

        if (cual.equals("cuadrado")) {
            resulta = new Cuadrado("Cuadrado", 10);
        }
        if (cual.equals("casita")) {
            resulta = new FiguraCompleja("Casita");
            ((FiguraCompleja) resulta).agregaFigura(FigurasFactory.getFigura("triangulo chico"));
            ((FiguraCompleja) resulta).agregaFigura(FigurasFactory.getFigura("cuadrado"));
        }
        return resulta;
    }
}
