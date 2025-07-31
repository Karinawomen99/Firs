package Clean.code.dz1.task5;

public class PayPalPayment implements Payment {
    public void process(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
