public class Barbarian extends CharacterClass {

    private String perk;

    public Barbarian() {
        this.type = "Barbarian";
        this.hp = 12;
        this.perk = "Battle Rage";
    }

    @Override
    public void printMagika() {
        System.out.println("Perk - " + perk);
    }

    @Override
    public String toString() {
        return "Barbarian = { HP = " + hp + ", perk = " + perk + " }";
    }
}
