import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    Cleffa(String name, int level){
        super (name, level);
        this.addType(Type.FAIRY);
        this.setStats(50,25,28,45,55,15);
        this.addMove(new Flamethrower());
        this.addMove(new Sing());
    }
}
