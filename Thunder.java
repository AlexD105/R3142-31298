import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    protected String describe(){
        return ("осветил весь Петербург");
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.sleep(p);
    }
}
