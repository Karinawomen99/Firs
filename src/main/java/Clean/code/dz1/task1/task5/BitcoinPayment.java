package Clean.code.dz1.task1.task5;

public class BitcoinPayment implements Payment {
    public void process(double amount){
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
