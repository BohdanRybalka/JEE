public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Barbarian" -> new Barbarian();
            case "Cleric" -> new Cleric();
            default -> throw new IllegalArgumentException("Class type doesn't exist");
        };
    }
}
