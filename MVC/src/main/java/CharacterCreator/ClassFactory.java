package CharacterCreator;

public class ClassFactory {
    public static CharacterClass getClass(ClassAbstractFactory factory){
        return factory.create();
    }
}
