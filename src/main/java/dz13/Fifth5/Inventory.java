package dz13.Fifth5;

import java.util.*;
import java.util.stream.Collectors;

// Реализация интерфейса InventoryService
public class Inventory implements InventoryService {
    private Map<String, List<Product>> stock; // Склад, где ключ — категория, значение — список товаров
    private boolean isInventoryOpen;          // Флаг доступа к складу

    // Конструктор
    public Inventory() {
        this.stock = new HashMap<>();
        this.isInventoryOpen = true; // По умолчанию склад открыт
    }

    // Метод для открытия/закрытия склада
    public void setInventoryOpen(boolean status) {
        this.isInventoryOpen = status;
    }

    // Метод добавления товара
    @Override
    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Склад закрыт. Добавление товара запрещено.");
            throw new RuntimeException("Склад закрыт");
        }

        // Добавляем товар в нужную категорию
        stock.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
        System.out.println("Добавлен товар: " + product);
    }

    // Извлечение товара по категории
    @Override
    public Product retrieveProduct(String category) throws OutOfStockException {
        List<Product> products = stock.get(category);

        // Проверка: есть ли товары в этой категории
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("Товары в категории '" + category + "' отсутствуют.");
        }

        // Удаляем и возвращаем первый товар из списка
        Product retrieved = products.remove(0);
        System.out.println("Извлечён товар: " + retrieved);
        return retrieved;
    }

    @Override
    public List<Product> filterProductByPrice(String category, double maxPrice) {
        return List.of();
    }

    // Фильтрация товаров по категории и цене
    @Override
    public List<Product> filterProductsByPrice(String category, double maxPrice) {
        return stock.getOrDefault(category, new ArrayList<>())
                .stream()
                .filter(p -> p.getPrice() <= maxPrice) // Лямбда-фильтрация по цене
                .collect(Collectors.toList());
    }
}
