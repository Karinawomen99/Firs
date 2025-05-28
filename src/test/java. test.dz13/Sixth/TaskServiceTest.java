package sixth;

import dz13.sixth.Task;
import dz13.sixth.TaskService;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    @Test void testAddTask(){
        TaskService<String>service = new TaskService<>();
        Task<String>task = new Task<>("1",Task.Status.NEW, Task.Priority.HIGT, LocalDateTime.now());
        service.addTask(task);
        assertEquals(1,service.getAll().size());
    }
    @Test void testAddDublicateTask(){
        TaskService<String>service = new TaskService<>();
        Task<String>task = new Task<>("1",Task.Status.NEW, Task.Priority.HIGT, LocalDateTime.now());
        service.addTask(task);
        assertThrows(IllegalArgumentException.class,()->service.addTask(task));
    }
    @Test void testRemoveTask (){
    TaskService<String>service = new TaskService<>();
        Task<String>task = new Task<>("1",Task.Status.NEW, Task.Priority.HIGT, LocalDateTime.now());
        service.addTask(task);
        assertTrue(service.removeTaskById("1"));
        assertFalse(service.removeTaskById("1"));
    }
    @Test
    void testFilterByStatus(){
        TaskService<String>service = new TaskService<>();
        service.addTask (new Task<>("1",Task.Status.NEW, Task.Priority.LOW, LocalDateTime.now()));
        service.addTask(new Task<>("2",Task.Status.DONE, Task.Priority.HIGT, LocalDateTime.now()));

        List<Task<String>>result = service.getTasksBtStatus(Task.Status.NEW);
        assertEquals(1,result.size());
        assertEquals("1",result.get(0).getId());
    }
    @Test
    void testSortByDate(){
        TaskService<String>service = new TaskService<>();
        service.addTask(new Task<>("A", Task.Status.NEW, Task.Priority.MEDIUM,LocalDateTime.of(2023,2,2,12,0)));
        service.addTask(new Task<>("B", Task.Status.NEW, Task.Priority.MEDIUM,LocalDateTime.of(2022,2,2,12,0)));
        List<Task<String>> sorted = service.getTaskSortedByDate();
        assertEquals("B",sorted.get(0).getId());


    }
}
