package dz6.zadach6;

abstract public class Plant {
    private String  name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void  care ();
}
