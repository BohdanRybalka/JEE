package CharacterCreator;

public class Elf extends CharacterRace {
    public Elf() {
        name = "Elf";
        bonuses = new Stats(0, 2, 0, 0, 1, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Elf");
    }
}
