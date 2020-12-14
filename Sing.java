import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing(){
        super();
        this.type = Type.NORMAL;
        this.accuracy = 55;
    }

    protected String describe(){
        return ("надрывает голосовые связки");
    }
    protected void applyOppEffects(Pokemon p) {
        int t =  (int) Math.ceil(Math.random() * 3);
        Effect e = new Effect().condition(Status.SLEEP).turns(t);
        p.addEffect(e);
        p.getStat(Stat.HP);
    }
}
