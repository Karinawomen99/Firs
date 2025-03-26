package dz6.zadach5;

public class FarmManager {
    public void magerAnumal (FarmAnimal animal) {
        System.out.println( " Животное :"+animal.getName());
        animal.feed();
        animal.care();
    }
}
