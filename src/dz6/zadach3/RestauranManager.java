package dz6.zadach3;

public class RestauranManager {
    public void showDish(Dish dish){
        dish.describe();
    }
    public void add (Dish dish){
        System.out.println("Добавлено новое блюдо"+dish.getName());
        dish.describe();
    }
}
