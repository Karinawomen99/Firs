package dz6.zadach5;

abstract public class FarmAnimal {
    private String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public abstract void  feed();
    public abstract void  care();
}
