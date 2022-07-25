public class Sediento implements TamagachiState {

    @Override
    public TamagachiState darDeBeber() {
        return new Feliz();
    }

    @Override
    public TamagachiState darDeComer() {
        return new Sediento();
    }

    @Override
    public TamagachiState darCaricias() {
        return new Sediento();
    }
}
