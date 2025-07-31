package Mock;

import java.util.*; // импортируем всё нужное

public class Mock {
    public static void main(String[] args) {
        // Создаём список чисел
        List<Integer> list = Arrays.asList(8, 7, 6, 5, 4);

        // Находим минимальное значение
        int min1 = Collections.min(list); // 1-й минимум

        // Создаём переменную для 2-го минимума, начнем с "бесконечности"
        int min2 = Integer.MAX_VALUE;

        // Ищем 2-й минимум вручную
        for (int num : list) {          // пробегаем по каждому числу
            if (num != min1 && num < min2) {
                min2 = num;             // сохраняем, если меньше текущего второго минимума
            }
        }

        System.out.println("Второй минимум: " + min2);
    }
}

