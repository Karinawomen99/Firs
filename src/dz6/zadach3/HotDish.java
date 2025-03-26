package dz6.zadach3;

public class HotDish extends Dish {
    private final int temperature;

    public HotDish(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public void describe() {
        System.out.println("Горячее блюдо"+getName()+"температура подачи"+temperature +"°C");

    }
}
