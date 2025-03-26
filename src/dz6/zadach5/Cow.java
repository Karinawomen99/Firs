package dz6.zadach5;

public class Cow extends FarmAnimal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName()+ " пасется на лугу");

    }

    @Override
    public void care() {
        System.out.println(getName()+" даёт молоко.");

    }
}
