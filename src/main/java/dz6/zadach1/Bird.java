package dz6.zadach1;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(getName()+"-Чирикает!" );

    }

    @Override
    void move() {
        System.out.println(getName()+"-Летает");

    }
}
