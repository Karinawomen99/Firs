package dz6.zadach5;

public class Chicken extends FarmAnimal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест зерно из кормушки");
    }

    @Override
    public void care() {
        System.out.println(getName()+" нес1т яйца.");

    }
}
