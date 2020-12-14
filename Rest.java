import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super();
        this.type = Type.PSYCHIC;
    }

    protected String describe(){
        return "решил прилечь";
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
    }
}








