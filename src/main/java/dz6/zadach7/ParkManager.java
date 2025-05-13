package dz6.zadach7;

public class ParkManager {
    public void mangeAttraction(Attraction attraction){
        System.out.println( "Аттракцион:"+attraction.getName());
        attraction.maintain();
        attraction.proivedInfo();
    }
}
