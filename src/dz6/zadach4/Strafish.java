package dz6.zadach4;

public class Strafish extends SeaCreature {
    public Strafish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName()+" медленно ползет по дну.");
    }

    @Override
    public void behave() {
        System.out.println(getName()+ " ведет себя спокойно.");

    }
}
