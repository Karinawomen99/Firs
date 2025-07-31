package Clean.code.dz1.task6;

public class Main{
    public static void main(String[] args) {
        FlyingBird bird =new Sparrow();
        bird.fly();

        Animal penguin = new Penguin();
        penguin.makeSound();
    }
}
