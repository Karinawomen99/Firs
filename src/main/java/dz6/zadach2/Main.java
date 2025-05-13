package dz6.zadach2;

public class Main {
    public static void main(String[] args) {
        {

            Pet cat = new Cat("Милка");
            Pet dog = new Dog("Берта");
            PetManger manger = new PetManger();
            manger.Show(cat);
            manger.Show(dog);
            manger.add(cat);
        }
    }
}
