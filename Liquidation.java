import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Liquidation extends PhysicalMove {
    public Liquidation (){
        super(Type.WATER, 85, 100);
    }

    protected String describe (){
        return ("выносит вперед ногами");
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }
}
