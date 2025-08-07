package Clean.code.dz1.dz2.task7;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String>items;
    private double discoint;
    private String paymentMethod;

    Order(List<String> items, double discoint, String paymentMethod){
        this.items =items;
        this.discoint =discoint;
        this.paymentMethod =paymentMethod;
    }
    public static class OrderBuilder {
        private List<String>items = new ArrayList<>();
        private double discoint;
        private String paymentMethod;

        public OrderBuilder addItem(String item){
            items.add(item);
            return this;
        }
        public OrderBuilder applyDiscount(double discoint){
            this.discoint=discoint;
            return this;
        }
        public OrderBuilder setPaymentMethod(String paymentMethod){
            this.paymentMethod = paymentMethod;
            return this;
        }
        public Order build (){
            return new Order(items,discoint,paymentMethod);
        }
    }

}
