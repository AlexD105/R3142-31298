import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy{
    public Clefable(String name, int level){
        super(name, level);
        this.addType(Type.FAIRY);
        this.setStats(95,70,73,95,90,60);
        this.addMove(new Flamethrower());
        this.addMove(new Sing());
        this.addMove(new WakeUpSlap());
        this.addMove(new Thunder());
    }
}
