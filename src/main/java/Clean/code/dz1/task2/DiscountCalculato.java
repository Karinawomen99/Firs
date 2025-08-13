package Clean.code.dz1.task2;

//public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
//    double discount = 0.0;
//
//    if (isLoyalCustomer) {
//        if (isFirstPurchase) {
//            discount = price * 0.10;
//        } else {
//            discount = price * 0.05;
//        }
//    } else {
//        if (hasCoupon) {
//            discount = price * 0.07;
//        } else {
//            discount = price * 0.02;
//        }
//    }
//    return price - discount;
//}
//
public class DiscountCalculato {
    public double calculaDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate = isLoyalCustomer
                ?(isFirstPurchase ? 0.10 :0.05)
                :(hasCoupon? 0.07 : 0.02);
        return price -(price *discountRate);
    }
}
