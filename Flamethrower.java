import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }

    protected String describe() {
        return ("делает жарко");
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.burn(p);
    }
}