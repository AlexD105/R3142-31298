import ru.ifmo.se.pokemon.Type;

public class Golisopod extends Wimpod {
    Golisopod(String name, int level) {
        super(name, level);
        this.addType(Type.BUG);
        this.addType(Type.WATER);
        this.setStats(25, 35, 40, 20, 30, 80);
        this.addMove(new Facade());
        this.addMove(new Waterfall());
        this.addMove(new DoubleTeam());
        this.addMove(new Liquidation());

    }
}
