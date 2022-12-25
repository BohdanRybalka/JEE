package CharacterCreator;

public class SorcererFactory implements ClassAbstractFactory {
    @Override
    public CharacterClass create() {
        return new Sorcerer();
    }
}