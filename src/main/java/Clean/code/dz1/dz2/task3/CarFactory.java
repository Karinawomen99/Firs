package Clean.code.dz1.dz2.task3;

public class CarFactory extends TransportFactory{
    @Override
    public Transport createTransport(){
        return new Car(); // создаём автомобиль
    }
}
