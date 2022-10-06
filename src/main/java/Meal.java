import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float total_price = 0;

        for( Item item: items ){
            total_price += item.price();
        }
        return total_price;
    }

    public void showItems(){
        for( Item item : items ){
            System.out.print("Meal: " + item.name() + ", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }

}
