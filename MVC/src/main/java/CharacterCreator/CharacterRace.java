package CharacterCreator;

import java.util.TreeMap;
import Visitor.DataElement;
import Visitor.DataElementsVisitor;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;
    public Stats getRaceBonuses() {
        return bonuses;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Race: " + name);

        for (String title : bonuses.getStats().keySet()) {
            System.out.println("Race bonus: " + title + " +" + bonuses.getStats().get(title));
        }

        System.out.println();
    }

    public abstract void saySMTH();

    @Override
    public TreeMap accept(DataElementsVisitor visitor) {
        return visitor.visit(this);
    }
}
