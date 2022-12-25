package CharacterCreator;

import java.util.TreeMap;
import Visitor.DataElement;
import Visitor.DataElementsVisitor;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int hp;

    public String getName() {
        return name;
    }

    public abstract void printMagica();

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Character " + name + ", health: " + hp;
    }
    
    @Override
    public TreeMap accept(DataElementsVisitor visitor) {
        return visitor.visit(this);
    }
}