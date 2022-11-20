import java.util.TreeMap;

public class Dwarf extends CharacterRace{
    public Dwarf() {
        this.race = "Dwarf (Hill)";
        this.bonuses = new Stats(0, 0, 2, 0, 1, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor, TreeMap<String, String> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void saySMTH() {
        System.out.println("Kingdoms rich in ancient grandeur, halls carved" +
                " into the roots of mountains, the echoing of picks and hammers " +
                "in deep mines and blazing forges, a commitment to clan and tradition," +
                " and a burning hatred of goblins and orcs – these common threads unite all dwarves.");
    }
}