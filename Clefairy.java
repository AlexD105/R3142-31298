import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa{
    Clefairy (String name, int level){
        super(name, level);
        this.addType(Type.FAIRY);
        this.setStats(70,45,48,60,65,35);
        this.addMove(new Flamethrower());
        this.addMove(new Sing());
        this.addMove(new WakeUpSlap());
    }
}
