package dz6.zadach2;

public class PetManger {
    public void Show(Pet pet) {
        System.out.println("Имя:"+pet.getName());
        pet.eat();
        pet.play();
    }

    public void add(Pet pet){
        System.out.println("Добавлен новый питомец"+pet.getName());
        pet.play();
        pet.eat();
    }

}
