public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder order = new MealBuilder();

        Meal veg_menu = order.prepareVegMeal();
        System.out.println("Vegetarian menu:");
        veg_menu.showItems();
        System.out.printf("Total cost %.0f$\n", veg_menu.getCost());

        Meal non_veg_menu = order.prepareNonVegMeal();
        System.out.println("\nNon-vegetarian menu:");
        non_veg_menu.showItems();
        System.out.printf("Total cost %.0f$\n", non_veg_menu.getCost());

    }
}
