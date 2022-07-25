
   public class Main {
       public static void main(String[] args) {
           Dibujo d = new Dibujo();
           d.agrega(FigurasFactory.getFigura("triangulo grande"));
           d.agrega(FigurasFactory.getFigura("cuadrado"));
           d.agrega(FigurasFactory.getFigura("casita"));
           d.dibuja();
       }
}