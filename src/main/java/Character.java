import java.util.TreeMap;

public class Character implements DataElement{
    private String name;
    private CharacterRace race;
    private Stats attributes;

    public Character(String name, CharacterRace dndClass) {
        this.name = name;
        this.race = dndClass;
        attributes = Stats.generate();
    }

    @Override
    public void accept(DataElementVisitor visitor, TreeMap<String, String> map) {
        map.putAll(visitor.visit(this));
        map.putAll(visitor.visit(race));
        map.putAll(visitor.visit(attributes));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterRace getRace() {
        return race;
    }

    public void setRace(CharacterRace dndClass) {
        this.race = dndClass;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void addRaceBonuses() {
        for (String bonus : race.getBonuses().getStats().keySet()) {
            attributes.getStats().put(bonus, attributes.getStats().get(bonus) + race.getBonuses().getStats().get(bonus));
        }
    }

    public void talk() {
        System.out.println("Name: " + name + ", race: " + race.getRace() + ", attributes: " + attributes);

        race.print();
        race.saySMTH();
    }
}