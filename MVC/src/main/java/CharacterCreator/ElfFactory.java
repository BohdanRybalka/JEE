package CharacterCreator;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public Elf create() {
        return new Elf();
    }
}
