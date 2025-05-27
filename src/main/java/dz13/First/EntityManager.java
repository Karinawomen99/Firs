package dz13.First;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс для управления коллекцией объектов произвольного типа T с потокобезопасными операциями.
 * @param <T> тип управляемых сущностей
 */
public class EntityManager<T> {
    // Основное хранилище сущностей
    private final List<T> entities;

    /**
     * Конструктор по умолчанию инициализирует потокобезопасный список.
     * Используем synchronizedList для обеспечения потокобезопасности.
     */
    public EntityManager() {
        this.entities = Collections.synchronizedList(new ArrayList<>());
    }

    /**
     * Добавляет сущность в коллекцию.
     * Потокобезопасность обеспечивается synchronizedList.
     * @param entity сущность для добавления
     */
    public void add(T entity) {
        entities.add(entity);
    }

    /**
     * Удаляет сущность из коллекции.
     * Потокобезопасность обеспечивается synchronizedList.
     * @param entity сущность для удаления
     * @return true если сущность была удалена, false если не найдена
     */
    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    /**
     * Возвращает копию списка всех сущностей.
     * Создание копии гарантирует, что исходная коллекция не может быть изменена через возвращаемый список.
     * @return копия списка сущностей
     */
    public List<T> getAll() {
        return new ArrayList<>(entities);
    }

    /**
     * Универсальный метод фильтрации сущностей по заданному условию.
     * @param predicate условие фильтрации
     * @return отфильтрованный список сущностей
     */
    public List<T> filter(Predicate<T> predicate) {
        // Используем synchronized блок для потокобезопасной работы со stream
        synchronized (entities) {
            return entities.stream()
                    .filter(predicate)
                    .collect(Collectors.toList());
        }
    }

    // Далее идут специализированные методы фильтрации,
    // которые предполагают, что T имеет определенные методы.
    // В реальном коде T должен иметь соответствующий интерфейс или базовый класс.

    /**
     * Фильтрация по возрасту (предполагается, что T имеет метод getAge())
     * @param minAge минимальный возраст
     * @param maxAge максимальный возраст
     * @return список сущностей, удовлетворяющих условию
     */
    public List<T> filterByAge(int minAge, int maxAge) {
        return filter(entity -> {
            try {
                int age = (int) entity.getClass().getMethod("getAge").invoke(entity);
                return age >= minAge && age <= maxAge;
            } catch (Exception e) {
                return false;
            }
        });
    }

    /**
     * Фильтрация по имени (предполагается, что T имеет метод getName())
     * @param name имя для поиска (точное совпадение)
     * @return список сущностей с заданным именем
     */
    public List<T> filterByName(String name) {
        return filter(entity -> {
            try {
                String entityName = (String) entity.getClass().getMethod("getName").invoke(entity);
                return entityName.equals(name);
            } catch (Exception e) {
                return false;
            }
        });
    }

    /**
     * Фильтрация по активности (предполагается, что T имеет метод isActive())
     * @param active статус активности для поиска
     * @return список сущностей с заданным статусом активности
     */
    public List<T> filterByActive(boolean active) {
        return filter(entity -> {
            try {
                boolean isActive = (boolean) entity.getClass().getMethod("isActive").invoke(entity);
                return isActive == active;
            } catch (Exception e) {
                return false;
            }
        });
    }
}