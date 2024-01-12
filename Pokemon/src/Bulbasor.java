public class Bulbasor extends Pokemon implements IPlanta{
    public Bulbasor() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasor, Ataque Placaje!!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasor, Ataque Arañazo!!!");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Bulbasor, Ataque Mordizco!!!");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasor, Utiliza Drenaje!!!");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasor, Ataque Paralizar!!!");

    }
}
