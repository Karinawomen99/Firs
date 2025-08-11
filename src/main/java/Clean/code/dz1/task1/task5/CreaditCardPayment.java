package Clean.code.dz1.task1.task5;

public class CreaditCardPayment implements Payment {
    public void process( double amount ){
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
