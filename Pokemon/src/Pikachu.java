public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu, Ataque Placaje!!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu, Ataque Arañazo!!!");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Pikachu, Ataque Mordizco!!!");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu, ImpacTrueno Ahora!!!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu, Ataque Puño Trueno!!!");

    }
}
