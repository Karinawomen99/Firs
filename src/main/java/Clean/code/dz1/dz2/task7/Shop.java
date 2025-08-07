package Clean.code.dz1.dz2.task7;

public class Shop {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder()
                .addItem("Телефон")
                .addItem("Мышка")
                .applyDiscount(10)
                .setPaymentMethod("Банковская карта")
                .build();
        System.out.println(order);

        System.out.println("----");


    }
}
