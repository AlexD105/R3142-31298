import ru.ifmo.se.pokemon.*;

public class PoisonTail extends PhysicalMove {
    public PoisonTail () {
        super(Type.POISON, 50, 100);
    }

    protected String describe() {
        return ("отравляет хвостом");
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() <= att.getStat(Stat.SPEED) * 3 / 512) return 2;
        else return 1;
    }
}


