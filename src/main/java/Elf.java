import java.util.TreeMap;

public class Elf extends CharacterRace{
    public Elf() {
        this.race = "Elf (High)";
        this.bonuses = new Stats(0, 0, 2, 0, 1, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor, TreeMap<String, String> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void saySMTH() {
        System.out.println("High elves, also sometimes known as eladrin, " +
                "were graceful warriors and wizards who originated from the " +
                "realm of Faerie, also known as the Feywild.");
    }
}