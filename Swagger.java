import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super ();
        this.type = Type.POISON;
        this.accuracy = 85;
    }

    protected String describe(){
        return ("скидыщ");
    }
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }
}
