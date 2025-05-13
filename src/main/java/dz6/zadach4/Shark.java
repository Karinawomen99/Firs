package dz6.zadach4;

public class Shark extends SeaCreature {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName()+" быстро плавает.");

    }

    @Override
    public void behave() {
        System.out.println(getName() + " ведет себя агрессивно.");

    }
}
