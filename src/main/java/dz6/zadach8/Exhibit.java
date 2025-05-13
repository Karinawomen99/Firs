package dz6.zadach8;

abstract public class Exhibit {
    private String name;

    public Exhibit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void preserve();
    public abstract void provideInfo();

}
