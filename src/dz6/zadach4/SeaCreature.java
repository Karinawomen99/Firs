package dz6.zadach4;

abstract public class SeaCreature {
    private String name;

    public SeaCreature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void move();
    public abstract void behave();
}
