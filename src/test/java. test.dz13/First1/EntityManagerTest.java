package First1;

import dz13.First1.EntityManager;
import dz13.First1.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class EntityManagerTest {
    private EntityManager<Student> manager;
    private Student user1;
    private Student user2;
    private Student user3;

    @BeforeEach
    void setUp() {
        manager = new EntityManager<>();
        user1 = new Student("Alice", 25, true);
        user2 = new Student("Bob", 30, false);
        user3 = new Student("Charlie", 35, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);
    }

    @Test
    void testAddAndGetAll() {
        // Проверка начального состояния (после setUp)
        assertEquals(3, manager.getAll().size());

        // Добавление нового элемента и проверка изменения размера
        Student newUser = new Student("Diana", 28, true);
        manager.add(newUser);
        assertEquals(4, manager.getAll().size()); // Проверка, что размер увеличился

        // Проверка содержимого
        List<Student> allUsers = manager.getAll();
        assertTrue(allUsers.contains(user1));
        assertTrue(allUsers.contains(user2));
        assertTrue(allUsers.contains(user3));
        assertTrue(allUsers.contains(newUser));
    }

    @Test
    void testRemove() {
        int initialSize = manager.getAll().size(); // Фиксируем начальный размер
        assertTrue(manager.remove(user2)); // Удаляем
        assertEquals(initialSize - 1, manager.getAll().size()); // Проверяем уменьшение
        assertFalse(manager.getAll().contains(user2)); // Проверяем отсутствие user2
        assertTrue(manager.getAll().contains(user1)); // Проверяем, что остальные на месте
        assertTrue(manager.getAll().contains(user3));
    }

    @Test
    void testFilterByAge() {
        int initialSize = manager.getAll().size();
        List<Student> filtered = manager.filterByAge(26, 34);
        assertEquals(initialSize, manager.getAll().size()); // Размер не должен измениться
        assertEquals(1, filtered.size());
        assertEquals(user2, filtered.get(0));
    }

    @Test
    void testFilterByName() {
        int initialSize = manager.getAll().size();
        List<Student> filtered = manager.filterByName("Alice");
        assertEquals(initialSize, manager.getAll().size()); // Размер не изменился
        assertEquals(1, filtered.size());
        assertEquals(user1, filtered.get(0));
    }

    @Test
    void testFilterByActive() {
        int initialSize = manager.getAll().size();
        List<Student> activeUsers = manager.filterByActive(true);
        assertEquals(initialSize, manager.getAll().size()); // Размер прежний
        assertEquals(2, activeUsers.size());
        assertTrue(activeUsers.contains(user1));
        assertTrue(activeUsers.contains(user3));

        List<Student> inactiveUsers = manager.filterByActive(false);
        assertEquals(initialSize, manager.getAll().size()); // Размер прежний
        assertEquals(1, inactiveUsers.size());
        assertEquals(user2, inactiveUsers.get(0));
    }

    @Test
    void testThreadSafety() throws InterruptedException {
        // Проверка добавления из нескольких потоков
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                manager.add(new Student("Thread1", i, true));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                manager.add(new Student("Thread2", i, false));
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        assertEquals(203, manager.getAll().size()); // 3 исходных + 200 новых
    }
}