public class EjercicioIntegrador {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Bulbasor bulbasor = new Bulbasor();


        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        charmander.atacarAraniazo();
        charmander.atacarPunioFuego();
        bulbasor.atacarAraniazo();
        bulbasor.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
    }
}
