public class AbstractFactoryDemo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory;

        raceAbstractFactory = new DwarfFactory();
        Character dwarf = new Character("Denis", raceAbstractFactory.create());
        dwarf.addRaceBonuses();
        dwarf.talk();

        raceAbstractFactory = new ElfFactory();
        Character elf = new Character("Dife", raceAbstractFactory.create());
        elf.addRaceBonuses();
        elf.talk();
    }
}
