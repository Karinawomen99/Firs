package dz12;
//Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.
import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        List<String> copy = new ArrayList<>(names);
        for (String name : copy) {
            if (name.startsWith("A")) {
                names.remove(name);
            }
        }
        System.out.println(names);
    }
}