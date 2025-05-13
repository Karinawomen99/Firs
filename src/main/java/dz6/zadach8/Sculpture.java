package dz6.zadach8;

public class Sculpture extends Exhibit {
    public Sculpture(String name) {
        super(name);
    }

    @Override
    public void preserve() {
        System.out.println(getName()+ " требует регулярной реставрации ");

    }

    @Override
    public void provideInfo() {
        System.out.println(getName()+"- это историческая скульптура.");

    }
}
