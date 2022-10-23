public class Demo {
    public static void main(String[] args) {
        Character barbarian = new Character("Haluk", ClassFactory.getClass("Barbarian"));
        barbarian.printCharacter();

        barbarian.addClassBonuses();
        barbarian.printCharacter();

        Character cleric = new Character("Kired", ClassFactory.getClass("Cleric"));
        cleric.printCharacter();

        cleric.addClassBonuses();
        cleric.printCharacter();
    }
}
