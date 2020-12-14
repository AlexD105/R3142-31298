import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap(){
        super(Type.FIGHTING, 70, 100);
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        Status Pok_Con = def.getCondition();
        if (Pok_Con.equals(Status.SLEEP)){
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
        Effect r = new Effect().condition(Status.NORMAL);
        def.addEffect(r);
    }
    protected String describe(){
        return ("дал леща");
    }
}




