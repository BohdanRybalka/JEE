public class Stats {
    private Stats state;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int wisdom;
    private int charisma;

    public Stats(Stats state) {
        this.state = state;
    }

    public int getCha() {
        return charisma;
    }

    public int getCon() {
        return constitution;
    }

    public int getDex() {
        return dexterity;
    }

    public Stats getState() {
        return state;
    }

    public int getIntell() {
        return intellect;
    }

    public int getStr() {
        return strength;
    }

    public int getWis() {
        return wisdom;
    }

    public Stats() {
        strength = 0;
        dexterity = 0;
        constitution = 0;
        intellect = 0;
        wisdom = 0;
        charisma = 0;
    }

    public Stats(int str, int dex, int con, int intell, int wis, int cha) {
        this.strength = str;
        this.dexterity = dex;
        this.constitution = con;
        this.intellect = intell;
        this.wisdom = wis;
        this.charisma = cha;
    }

    public static Stats generateStats() {
        return new Stats(Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat());
    }

    public void printStats() {
        System.out.println("---------------\nAttributes:" + "\nStrength: " + strength +
                "\nDexterity: " + dexterity + "\nConstitution: " + constitution +
                "\nIntelligence: " + intellect + "\nWisdom: " + wisdom + "\nCharisma: " + charisma + "\n---------------\n");
    }
}