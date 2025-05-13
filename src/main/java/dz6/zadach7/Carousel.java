package dz6.zadach7;

public class Carousel extends Attraction {
    public Carousel(String name) {
        super(name);
    }

    @Override
    public void maintain() {
        System.out.println(getName()+" требует частного технического обслуживвания.");

    }

    @Override
    public void proivedInfo() {
        System.out.println(getName()+" - это семейный аттракцион.");

    }
}
