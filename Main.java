import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon Rongo = new Seviper("Rongo", 160);
        Pokemon Mango = new Wimpod("MANGO YBICA", 46);
        Pokemon Pongo = new Golisopod("Pusicle", 186);
        Pokemon Vongo = new Cleffa("Von", 44);
        Pokemon Lolgo = new Clefairy("Lol", 113);
        Pokemon Kingo = new Clefable("King", 217);




        b.addAlly(Mango);
        b.addAlly(Rongo);
        b.addAlly(Lolgo);

        b.addFoe(Vongo);
        b.addFoe(Kingo);
        b.addFoe(Pongo);

        b.go();
    }
}
