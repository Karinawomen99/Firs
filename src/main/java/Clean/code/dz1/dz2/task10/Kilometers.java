package Clean.code.dz1.dz2.task10;

public class Kilometers implements Distance{
    private double kilometers;
    public Kilometers(double kilometers){
        this.kilometers = kilometers;
    }
    @Override
    public double getDistanceInKilometers(){
        return kilometers;
    }
}
