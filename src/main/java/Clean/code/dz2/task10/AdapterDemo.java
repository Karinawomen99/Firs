package Clean.code.dz2.task10;

public class AdapterDemo {
    public static void main(String[] args) {
        Miles oldSystem = new Miles(10);

        Distance adapter =new MilesToKilometersAdapter(oldSystem);
        System.out.println("Расстояние в километрах :"+adapter.getDistanceInKilometers());
    }
}
