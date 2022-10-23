import java.util.ArrayList;
import java.util.Arrays;

public class Cleric extends CharacterClass{

    private ArrayList<String> spells;

    public Cleric(){
        this.type = "Cleric";
        this.spells = new ArrayList<>(Arrays.asList("Guidance", "Heal"));
        this.hp = 8;
    }

    @Override
    public void printMagika(){
        System.out.println("Spells: " + String.join(", ", spells));
    }

    @Override
    public String toString() {
        return "Cleric = { HP = " + hp + ", spells = " + String.join(", ", spells) + " }";
    }

}
