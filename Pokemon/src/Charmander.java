public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander, Ataque Placaje!!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander, Ataque Arañazo!!!");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Charmander, Ataque Mordizco!!!");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander, Puño de Fuego!!!");

    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander, Ataque Lanza Llamas!!!");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander, Ataque Ascuas!!!");

    }
}
