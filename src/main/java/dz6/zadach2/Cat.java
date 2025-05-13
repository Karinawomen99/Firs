package dz6.zadach2;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"-ест влажный корм");

    }

    @Override
    public void play() {
        System.out.println(getName()+"-играется");

    }
}
