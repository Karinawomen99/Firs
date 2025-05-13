package dz6.zadach1;

public class Elephant  extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(getName()+ "-Трубит!");

    }

    @Override
    void move() {
        System.out.println(getName()+"-Ходит.");

    }
}
