package dz6.zadach8;

public class MuseumManager {
    public  void  managerExhibit( Exhibit exhibit){
        System.out.println("Экспонат:"+ exhibit.getName());
        exhibit.preserve();
        exhibit.provideInfo();
    }
}
