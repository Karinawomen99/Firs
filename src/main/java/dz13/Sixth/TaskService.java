package dz13.sixth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        boolean exists = tasks.stream().anyMatch(t -> t.getId().equals(task.getId()));
        if (exists) {
            throw new IllegalArgumentException("Задача с таким ID уже есть ");
        }
        tasks.add(task);

    }

    public synchronized boolean removeTaskById(T id) {
        return tasks.removeIf(t -> t.getId().equals(id));

    }

    public synchronized List<Task<T>> getTasksBtStatus(Task.Status status) {
        return tasks.stream().filter(t -> t.getStatus() == status).collect(Collectors.toList());
    }

    public synchronized List<Task<T>> getTasksByPriority(Task.Priority priority) {
        return tasks.stream().filter(t -> t.getPriority() == priority).collect(Collectors.toList());
    }
    public synchronized List<Task<T>> getTaskSortedByDate() {
        return tasks.stream().sorted(Comparator.comparing (Task::getDate)).collect(Collectors.toList());
}
public List<Task<T>>getAll(){
    return List.copyOf(tasks);
    }
}