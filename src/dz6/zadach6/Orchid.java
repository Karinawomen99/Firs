package dz6.zadach6;

public class Orchid extends Plant {
    public Orchid(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName()+ " требует высокой влажности и тени .");

    }
}
