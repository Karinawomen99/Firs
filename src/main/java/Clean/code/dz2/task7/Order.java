package Clean.code.dz2.task7;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private double discount;
    private String paymentMethod;

    Order(List<String> items, double discount, String paymentMethod) {
        this.items = items;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    @Override // переопределила toString
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", discount=" + discount + "%" +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public static class OrderBuilder {
        private List<String> items = new ArrayList<>();
        private double discount;
        private String paymentMethod;

        public OrderBuilder addItem(String item) {
            items.add(item);
            return this;
        }

        public OrderBuilder applyDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(items, discount, paymentMethod);
        }
    }
}