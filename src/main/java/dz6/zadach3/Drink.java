package dz6.zadach3;

public class Drink extends Dish {
    private  int volume;
    public Drink(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public void describe() {
        System.out.println( "Напиток-"+getName()+"объем:"+volume + "мл");

    }
}
