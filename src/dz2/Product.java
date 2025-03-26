package dz2;

public class Product {
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;}

    public String getName() {return name;}
    public double getPrice() {return price;}
    public void setPrice(double price){this.price =price;}
    public void  applyDiscount(double discount){
        price =price * (1- discount/100); }//уменьшение цены на дисконт процент
    public void printInfo (){
        System.out.println( "Товар:" +name + ",Цена" +price +"руб");

}
}
