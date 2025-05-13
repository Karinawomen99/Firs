package dz6.zadach3;

public class Main {
    public static void main(String[] args) {
        Dish soup = new HotDish(" Супчик,", 70);
        Dish coffee = new Drink(" Кофе", -200);
        RestauranManager manager = new RestauranManager();
        manager.showDish(soup);
        manager.showDish(coffee);
        manager.add(soup);
    }
}
