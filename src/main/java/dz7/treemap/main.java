package dz7.treemap;

import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        /*
        TreeMap<String ,Integer> studentCourse =new TreeMap<>();
        studentCourse.put("Иван", 89);
        studentCourse.put("Катя", 189);
        studentCourse.put("Саша", 289);
        studentCourse.put("Игорь", 9);
        studentCourse.put("Олег", 79);
        System.out.println("Остартированные имена и баллы:");
        for(Map.Entry<String,Integer>entry:studentCourse.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());

         */
        TreeMap<String, Integer> studentCourse = new TreeMap<>();
        studentCourse.put("Иван", 89);
        studentCourse.put("Катя", 189);
        studentCourse.put("Саша", 289);
        studentCourse.put("Игорь", 29);
        studentCourse.put("Олег", 79);
        String minKey = studentCourse.firstKey();
        String maxKey = studentCourse.lastKey();
        System.out.println("Минимальный ключ" + minKey);
        System.out.println("Максимальный ключ" + maxKey);
    }
}

