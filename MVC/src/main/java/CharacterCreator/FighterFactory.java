package CharacterCreator;

public class FighterFactory implements ClassAbstractFactory {
    @Override
    public CharacterClass create() {
        return new Fighter();
    }
}
