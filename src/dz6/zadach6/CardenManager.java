package dz6.zadach6;

public class CardenManager {
    public void careForPlant( Plant plant){
        System.out.println("Растение "+plant.getName());
        plant.care();
    }
    public void add (Plant plant){
        System.out.println("Добавлено новое растение"+plant.getName());
        plant.care();
    }
}
