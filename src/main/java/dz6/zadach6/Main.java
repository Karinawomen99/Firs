package dz6.zadach6;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid(" Орхидея");
        Plant cactus = new Cactus( " Кактус ");
        CardenManager manager = new CardenManager();
        manager.careForPlant(orchid);
        manager.careForPlant(cactus);
        manager.add(cactus);
    }
}
