public class VisitorDemo {
    public static void main(String[] args) {
        ElementVisitor visitor = new ElementVisitor();

        DwarfFactory dwarfFactory = new DwarfFactory();
        Character dwarf = new Character("Ratuj", dwarfFactory.create());
        dwarf.addRaceBonuses();
        dwarf.talk();
        dwarf.accept(visitor);

        ElfFactory elfFactory = new ElfFactory();
        Character elf = new Character("Tyhfer", elfFactory.create());
        elf.addRaceBonuses();
        elf.talk();
        elf.accept(visitor);
    }
}