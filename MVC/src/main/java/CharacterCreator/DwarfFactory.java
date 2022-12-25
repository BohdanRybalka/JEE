package CharacterCreator;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public Dwarf create() {
        return new Dwarf();
    }
}
