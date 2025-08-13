package dz13.Fifth5;

import java.util.List;

public interface InventoryService{
    void addProduct(Product product);
    Product retrieveProduct(String category)throws OutOfStockException;
    List<Product>filterProductByPrice(String category,double maxPrice);

    // Фильтрация товаров по категории и цене
    List<Product> filterProductsByPrice(String category, double maxPrice);
}
