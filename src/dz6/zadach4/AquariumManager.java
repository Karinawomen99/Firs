package dz6.zadach4;

public class AquariumManager {
    public void showCreature(SeaCreature creature){
        System.out.println( " Морское существо "+ creature.getName());
        creature.move();
        creature.behave();

    }
    public void add(SeaCreature seaCreature){
        System.out.println("Добавлено морское существо:");
        seaCreature.behave();
        seaCreature.move();
    }
}
