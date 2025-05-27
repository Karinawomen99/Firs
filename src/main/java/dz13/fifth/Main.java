package dz13.fifth;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Создание товаров
        Product p1 = new Product("Книга", 300, "Образование");
        Product p2 = new Product("Ноутбук", 45000, "Электроника");
        Product p3 = new Product("Карандаш", 20, "Образование");

        // Добавление товаров на склад
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Пробуем извлечь товар
        try {
            inventory.retrieveProduct("Образование");
        } catch (OutOfStockException e) {
            System.out.println("Ошибка "+e.getMessage());
        }
            List<Product>filtered = inventory.filterProductsByPrice("Образрование",100);
        System.out.println("Товары до 100 руб"+ filtered);
        inventory.setInventoryOpen(false);
        Product p4 = new Product("Телевизор",20000,"Электроника");
        inventory.addProduct(p4);
        }

        }


