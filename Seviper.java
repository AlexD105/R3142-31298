import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seviper extends Pokemon {
    Seviper(String name, int level){
        super(name, level);
        this.addType(Type.POISON);
        this.setStats(73,100,60, 100,60,65);
        this.addMove(new PoisonTail());
        this.addMove(new Swagger());
        this.addMove(new Rest());
        this.addMove(new DarkPulse());
    }

}
