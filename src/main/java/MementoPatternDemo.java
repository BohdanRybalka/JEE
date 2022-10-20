public class MementoPatternDemo {
    public static void main(String[] args) {

        Character player = new Character("Wraith knight", "barbarian", "human");

        Stats temp = Stats.generateStats();
        player.setAttributes(temp);
        player.printInfo();

        CareTaker careTaker = new CareTaker();
        Memento memento = new Memento();

        for (int i = 0; i < 3; i++) {
            temp = Stats.generateStats();
            temp.printStats();
            memento.setState(temp);
            careTaker.add(memento.getState());
        }

        for (int i = 0; i < 3; i++) {
            memento.setState(careTaker.get(i));
            temp = memento.getState();
            temp.printStats();
        }
    }
}