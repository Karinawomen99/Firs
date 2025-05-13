package dz6.zadach1;

public class ZooManager {

    public void Show(Animal animal) {
        System.out.println("Животное:" + animal.getName());
        animal.makeSound();
        animal.move();

    }
    public void add(Animal animal){
        System.out.println("Добавлено новое животное:"+animal.getName());
        animal.makeSound();
        animal.move();
    }

}


