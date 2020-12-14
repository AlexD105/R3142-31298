import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade (){
        super(Type.NORMAL, 70, 100);
    }

    protected String describe(){
        return "выходит из за угла";
    }
    protected void applyOppDamage(Pokemon def, double damage) {
        Status PokCon = def.getCondition();
        if (PokCon.equals(Status.BURN) || PokCon.equals(Status.POISON) || PokCon.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
}