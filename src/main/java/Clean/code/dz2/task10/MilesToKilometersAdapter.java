package Clean.code.dz2.task10;

public class MilesToKilometersAdapter implements Distance {
    private Miles miles;
    public MilesToKilometersAdapter(Miles miles){
        this.miles = miles;
    }
    @Override
    public double getDistanceInKilometers(){
        return miles.getDistanceMiles()* 1.680405;
    }
}
