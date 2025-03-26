package dz6.zadach4;

public class Main {
    public static void main(String[] args) {
        SeaCreature shark = new Shark("Акула");
        SeaCreature starfish = new Strafish(" Морская звезда");
        AquariumManager manager = new AquariumManager();
        manager.showCreature(shark);
        manager.showCreature(starfish);
        manager.add(shark);
    }
}
