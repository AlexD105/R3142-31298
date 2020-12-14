import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    public Waterfall (){
        super(Type.NORMAL, 80, 100);
    }

    protected String describe(){
        return "помыл соперника";
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) Effect.flinch(p);
    }
}