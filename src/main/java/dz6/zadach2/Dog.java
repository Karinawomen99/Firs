package dz6.zadach2;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"-ест сухой корм");

    }

    @Override
    public void play() {
        System.out.println(getName()+"-гуляет");

    }
}
