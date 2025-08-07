package Clean.code.dz1.dz2.task3;

public class BicycleFactory extends TransportFactory{
    @Override
    public Transport createTransport(){
        return new Bicycle();// Создала велосипед
    }
}
