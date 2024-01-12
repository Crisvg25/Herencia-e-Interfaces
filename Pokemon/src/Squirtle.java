public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle, Ataque Placaje!!!");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle, Ataque Arañazo!!!");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Squirtle, Ataque Mordizco!!!");

    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle, Hidro Bomba!!!");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle, Ataque Burbuja");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle, Ataque Pistola de Agua");

    }
}
