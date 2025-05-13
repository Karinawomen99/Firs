package dz6.zadach6;

public class Cactus  extends Plant {
    public Cactus(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName()+" требует много света и редкого полива .");

    }
}
