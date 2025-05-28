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
        List<Student> allUsers = manager.getAll();
        assertEquals(3, allUsers.size());
        assertTrue(allUsers.contains(user1));
        assertTrue(allUsers.contains(user2));
        assertTrue(allUsers.contains(user3));
    }

    @Test
    void testRemove() {
        assertTrue(manager.remove(user2));
        assertEquals(2, manager.getAll().size());
        assertFalse(manager.getAll().contains(user2));
    }

    @Test
    void testFilterByAge() {
        List<Student> filtered = manager.filterByAge(26, 34);
        assertEquals(1, filtered.size());
        assertEquals(user2, filtered.get(0));
    }

    @Test
    void testFilterByName() {
        List<Student> filtered = manager.filterByName("Alice");
        assertEquals(1, filtered.size());
        assertEquals(user1, filtered.get(0));
    }

    @Test
    void testFilterByActive() {
        List<Student> activeUsers = manager.filterByActive(true);
        assertEquals(2, activeUsers.size());
        assertTrue(activeUsers.contains(user1));
        assertTrue(activeUsers.contains(user3));

        List<Student> inactiveUsers = manager.filterByActive(false);
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